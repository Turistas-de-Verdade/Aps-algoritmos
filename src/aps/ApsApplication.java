package aps;

import java.util.Arrays;
import java.util.Random;

public class ApsApplication {

	/**
	 * to do bucketsort radixsort
	 * 
	 */
	private static final int VALOR_MAX = 10000;

	public static void populaArray(int array[]) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (r.nextInt(VALOR_MAX));
		}
	}

	public static void countingSort(int[] array, int max) {
		int arrayAux[] = new int[max + 1];
		for (int i : array) {
			arrayAux[i]++;
			System.out.print(i + " ");
		}
		System.out.print("\n\n");
		int j = 0;
		for (int i = 0; i < arrayAux.length; i++) {
			while (0 < arrayAux[i]) {
				array[j++] = i;
				arrayAux[i]--;
			}
		}
	}

	public static void chamaCountingSort(int tamArray, int VALOR_MAX) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Counting Sort:");
		System.out.println(Arrays.toString(array));

		countingSort(array, VALOR_MAX);

		System.out.println("Array depois do Counting Sort:");
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		chamaCountingSort(10, 1000000);

	}

}
