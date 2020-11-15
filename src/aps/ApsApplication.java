package aps;

import java.util.ArrayList;

public class ApsApplication {

	static ArrayList<Long> tempoDeExecArray = new ArrayList<Long>();

	public static void testaAlgoritmos() {
		for (int i = 0; i < 50; i++) {

			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaInsertionSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaSelectionSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaBubbleSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaMergeSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaQuickSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaHeapSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaCountingSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaRadixSort(10000));

			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(5));
			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(10));
			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(50));
			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(100));
			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(1000));
			tempoDeExecArray.add(i, Algoritmos.chamaBucketSort(10000));
		}

	}

	public static void main(String[] args) {
		testaAlgoritmos();

		System.out.println(tempoDeExecArray);
	}
}
