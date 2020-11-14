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

	public static void ordenarArvore(int array[], int p, int tamArray) {
		int filhoUm = (p * 2) + 1;
		int filhoDois = filhoUm + 1;

		if (filhoUm < tamArray) {
			if (filhoDois < tamArray) {
				if (array[filhoUm] < array[filhoDois]) {
					filhoUm = filhoDois;
				}
			}
			if (array[filhoUm] > array[p]) {
				int aux = array[filhoUm];
				array[filhoUm] = array[p];
				array[p] = aux;

				ordenarArvore(array, filhoUm, tamArray);
			}
		}
	}

	public static void montarArvoreHeap(int array[]) {
		for (int p = (array.length - 1) / 2; p >= 0; p--) {
			ordenarArvore(array, p, array.length);
		}
	}

	public static void heapSort(int array[]) {
		montarArvoreHeap(array);

		int n = array.length;

		for (int i = array.length - 1; i > 0; i--) {
			int aux = array[i];
			array[i] = array[0];
			array[0] = aux;
			ordenarArvore(array, 0, --n);
		}

	}

	public static void chamaHeapSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do HeapSort:");
		System.out.println(Arrays.toString(array));

		heapSort(array);

		System.out.println("Array depois do HeapSort:");
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) {

		chamaHeapSort(5);
	}

}
