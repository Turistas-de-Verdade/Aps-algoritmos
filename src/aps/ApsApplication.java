package aps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class ApsApplication {

	/**
	 * to do bucketsort
	 * 
	 */

	private static final int VALOR_MAX = 10000;
	private static final int TAM_BALDE = 15;

	public static void populaArray(int array[]) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (r.nextInt(VALOR_MAX));
		}
	}

	public static void bucketSort(int array[], int tBalde) {

		int numBaldes = (int) tBalde / 5;

		LinkedList[] B = new LinkedList[numBaldes];

		for (int i = 0; i < numBaldes; i++) {
			B[i] = new LinkedList<Integer>();
		}

		for (int i = 0; i < array.length; i++) {
			int j = numBaldes - 1;
			while (true) {
				if (j < 0) {
					break;
				}
				if (array[i] >= (j * 5)) {
					B[j].add(array[i]);
					break;
				}
				j--;
			}
		}

		int indice = 0;
		for (int i = 0; i < numBaldes; i++) {

			int[] arrayAux = new int[B[i].size()];

			for (int j = 0; j < arrayAux.length; j++) {
				arrayAux[j] = (Integer) B[i].get(j);
			}

			ordenaBalde(arrayAux);
			for (int j = 0; j < arrayAux.length; j++, indice++) {
				array[indice] = arrayAux[j];
			}
		}
	}

	public static void ordenaBalde(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int k = j - 1;
			while ((k > -1) && (array[k] > key)) {
				array[k + 1] = array[k];
				k--;
			}
			array[k + 1] = key;
		}
	}

	public static void chamaBucket(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Radix Sort:");
		System.out.println(Arrays.toString(array));

		bucketSort(array, TAM_BALDE);

		System.out.println("Array depois do Radix Sort:");
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		chamaBucket(50);

	}
}
