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

	public static void quickSort(int array[], int esq, int dir) {
		if (esq < dir) {
			int j = separar(array, esq, dir);
			quickSort(array, esq, j - 1);
			quickSort(array, j + 1, dir);
		}

	}

	private static int separar(int array[], int esq, int dir) {

		int i = esq + 1;
		int j = dir;
		int pivo = array[esq];
		while (i <= j) {
			if (array[i] <= pivo) {
				i++;
			} else if (array[j] > pivo) {
				j--;
			} else if (i <= j) {
				trocar(array, i, j);
				i++;
				j--;
			}
		}
		trocar(array, esq, j);
		return j;
	}

	private static void trocar(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	public static void chamaQuickSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do QuickSort:");
		System.out.println(Arrays.toString(array));

		quickSort(array, 0, (array.length - 1));

		System.out.println("Array depois do QuickSort:");
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {
		chamaQuickSort(10);
	}

}
