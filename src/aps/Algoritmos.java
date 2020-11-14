package aps;

import java.util.Arrays;
import java.util.Random;

public class Algoritmos {

	public static void populaArray(int array[]) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (r.nextInt() * 100000);
		}
	}

	/** SELECTION SORT */
	public static void selectionSort(int array[]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int guarda = array[i];
					array[i] = array[j];
					array[j] = guarda;
				}
			}
		}
	}

	public static void chamaSelectionSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Selection Sort:");
		System.out.println(Arrays.toString(array));

		selectionSort(array);

		System.out.println("Array depois do Selection Sort:");
		System.out.println(Arrays.toString(array));

	}

	/************************************************************/

	/** INSERTION SORT */
	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void chamaInsertionSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Insertion Sort:");
		System.out.println(Arrays.toString(array));

		insertionSort(array);

		System.out.println("Array depois do Insertion Sort:");
		System.out.println(Arrays.toString(array));

	}

	/***************************/

	/** BUBBLE SORT */
	public static void bubbleSort(int array[]) {
		int aux = 0;
		int i = 0;

		for (i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

	public static void chamaBubbleSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Bubble Sort:");
		System.out.println(Arrays.toString(array));

		bubbleSort(array);

		System.out.println("Array depois do Bubble Sort:");
		System.out.println(Arrays.toString(array));

	}

	/************************************/

	/** MERGE SORT */
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
				array[k] = array[j++];

			} else if (j > fim) {
				array[k] = array[i++];
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

	/******************************************************************/

}
