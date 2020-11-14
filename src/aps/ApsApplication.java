package aps;

import java.util.Arrays;
import java.util.Random;

public class ApsApplication {

	public static void populaArray(int array[]) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (r.nextDouble() * 10000);
		}
	}

	public static void mergeSort(int array[], int arrayAux[], int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(array, arrayAux, ini, meio);
			mergeSort(array, arrayAux, meio + 1, fim);
			intercalar(array, arrayAux, ini, meio, fim);
		}

	}

	private static void intercalar(int[] array, int[] arrayAux, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) {
			arrayAux[k] = array[k];
		}

		int i = ini;
		int j = meio + 1;

		for (int k = ini; k <= fim; k++) {
			if (i > meio) {
				array[k] = arrayAux[j++];
			} else if (j > fim) {
				array[k] = arrayAux[i++];
			} else if (arrayAux[i] < arrayAux[j]) {
				array[k] = arrayAux[i++];
			} else {
				array[k] = arrayAux[j++];
			}
		}
	}

	public static void chamaMergeSort(int tamArray) {
		int array[] = new int[tamArray];
		int arrayAux[] = new int[array.length];

		populaArray(array);

		System.out.println("Array antes do MergeSort:");
		System.out.println(Arrays.toString(array));

		mergeSort(array, arrayAux, 0, (array.length - 1));

		System.out.println("Array depois do MergeSort:");
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		

	}

}
