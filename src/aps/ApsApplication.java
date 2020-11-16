package aps;

import java.util.ArrayList;

public class ApsApplication {

	static ArrayList<TempoResult> result = new ArrayList<TempoResult>();

	public static void testaAlgoritmos() {
		for (int i = 0; i < 1; i++) {

			result.add(new TempoResult("Insertion de tamanho 5", Algoritmos.chamaInsertionSort(5)));
			result.add(new TempoResult("Insertion de tamanho 10", Algoritmos.chamaInsertionSort(10)));
			result.add(new TempoResult("Insertion de tamanho 50", Algoritmos.chamaInsertionSort(50)));
			result.add(new TempoResult("Insertion de tamanho 100", Algoritmos.chamaInsertionSort(100)));
			result.add(new TempoResult("Insertion de tamanho 1000", Algoritmos.chamaInsertionSort(1000)));
			result.add(new TempoResult("Insertion de tamanho 10000", Algoritmos.chamaInsertionSort(100000)));

			result.add(new TempoResult("Selection de tamanho 5", Algoritmos.chamaSelectionSort(5)));
			result.add(new TempoResult("Selection de tamanho 10", Algoritmos.chamaSelectionSort(10)));
			result.add(new TempoResult("Selection de tamanho 50", Algoritmos.chamaSelectionSort(50)));
			result.add(new TempoResult("Selection de tamanho 100", Algoritmos.chamaSelectionSort(100)));
			result.add(new TempoResult("Selection de tamanho 1000", Algoritmos.chamaSelectionSort(1000)));
			result.add(new TempoResult("Selection de tamanho 10000", Algoritmos.chamaSelectionSort(10000)));

			result.add(new TempoResult("Bubble de tamanho 5", Algoritmos.chamaBubbleSort(5)));
			result.add(new TempoResult("Bubble de tamanho 10", Algoritmos.chamaBubbleSort(10)));
			result.add(new TempoResult("Bubble de tamanho 50", Algoritmos.chamaBubbleSort(50)));
			result.add(new TempoResult("Bubble de tamanho 100", Algoritmos.chamaBubbleSort(100)));
			result.add(new TempoResult("Bubble de tamanho 1000", Algoritmos.chamaBubbleSort(1000)));
			result.add(new TempoResult("Bubble de tamanho 10000", Algoritmos.chamaBubbleSort(10000)));

			result.add(new TempoResult("Merge de tamanho 5", Algoritmos.chamaMergeSort(5)));
			result.add(new TempoResult("Merge de tamanho 10", Algoritmos.chamaMergeSort(10)));
			result.add(new TempoResult("Merge de tamanho 50", Algoritmos.chamaMergeSort(50)));
			result.add(new TempoResult("Merge de tamanho 100", Algoritmos.chamaMergeSort(100)));
			result.add(new TempoResult("Merge de tamanho 1000", Algoritmos.chamaMergeSort(1000)));
			result.add(new TempoResult("Merge de tamanho 10000", Algoritmos.chamaMergeSort(10000)));

			result.add(new TempoResult("Quick de tamanho 5", Algoritmos.chamaQuickSort(5)));
			result.add(new TempoResult("Quick de tamanho 10", Algoritmos.chamaQuickSort(10)));
			result.add(new TempoResult("Quick de tamanho 50", Algoritmos.chamaQuickSort(50)));
			result.add(new TempoResult("Quick de tamanho 100", Algoritmos.chamaQuickSort(100)));
			result.add(new TempoResult("Quick de tamanho 1000", Algoritmos.chamaQuickSort(1000)));
			result.add(new TempoResult("Quick de tamanho 10000", Algoritmos.chamaQuickSort(10000)));

			result.add(new TempoResult("Heap de tamanho 5", Algoritmos.chamaHeapSort(5)));
			result.add(new TempoResult("Heap de tamanho 10", Algoritmos.chamaHeapSort(10)));
			result.add(new TempoResult("Heap de tamanho 50", Algoritmos.chamaHeapSort(50)));
			result.add(new TempoResult("Heap de tamanho 100", Algoritmos.chamaHeapSort(100)));
			result.add(new TempoResult("Heap de tamanho 1000", Algoritmos.chamaHeapSort(1000)));
			result.add(new TempoResult("Heap de tamanho 10000", Algoritmos.chamaHeapSort(10000)));

			result.add(new TempoResult("Counting de tamanho 5", Algoritmos.chamaCountingSort(5)));
			result.add(new TempoResult("Counting de tamanho 10", Algoritmos.chamaCountingSort(10)));
			result.add(new TempoResult("Counting de tamanho 50", Algoritmos.chamaCountingSort(50)));
			result.add(new TempoResult("Counting de tamanho 100", Algoritmos.chamaCountingSort(100)));
			result.add(new TempoResult("Counting de tamanho 1000", Algoritmos.chamaCountingSort(1000)));
			result.add(new TempoResult("Counting de tamanho 10000", Algoritmos.chamaCountingSort(10000)));

			result.add(new TempoResult("Radix de tamanho 5", Algoritmos.chamaRadixSort(5)));
			result.add(new TempoResult("Radix de tamanho 10", Algoritmos.chamaRadixSort(10)));
			result.add(new TempoResult("Radix de tamanho 50", Algoritmos.chamaRadixSort(50)));
			result.add(new TempoResult("Radix de tamanho 100", Algoritmos.chamaRadixSort(100)));
			result.add(new TempoResult("Radix de tamanho 1000", Algoritmos.chamaRadixSort(1000)));
			result.add(new TempoResult("Radix de tamanho 10000", Algoritmos.chamaRadixSort(10000)));

			result.add(new TempoResult("Bucket de tamanho 5", Algoritmos.chamaBucketSort(5)));
			result.add(new TempoResult("Bucket de tamanho 10", Algoritmos.chamaBucketSort(10)));
			result.add(new TempoResult("Bucket de tamanho 50", Algoritmos.chamaBucketSort(50)));
			result.add(new TempoResult("Bucket de tamanho 100", Algoritmos.chamaBucketSort(100)));
			result.add(new TempoResult("Bucket de tamanho 1000", Algoritmos.chamaBucketSort(1000)));
			result.add(new TempoResult("Bucket de tamanho 10000", Algoritmos.chamaBucketSort(10000)));

		}

	}

	public static void main(String[] args) {
		testaAlgoritmos();

		for (int i = 0; i < result.size(); i++) {

			System.out.println(result.get(i));
		}

	}
}
