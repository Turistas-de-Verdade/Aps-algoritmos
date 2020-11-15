package aps;

public class ApsApplication {

	public static void testaAlgoritmos() {
		for (int i = 0; i < 50; i++) {

			Algoritmos.chamaInsertionSort(5);
			Algoritmos.chamaInsertionSort(10);
			Algoritmos.chamaInsertionSort(50);
			Algoritmos.chamaInsertionSort(100);
			Algoritmos.chamaInsertionSort(1000);
			Algoritmos.chamaInsertionSort(10000);

			Algoritmos.chamaSelectionSort(5);
			Algoritmos.chamaSelectionSort(10);
			Algoritmos.chamaSelectionSort(50);
			Algoritmos.chamaSelectionSort(100);
			Algoritmos.chamaSelectionSort(1000);
			Algoritmos.chamaSelectionSort(10000);

			Algoritmos.chamaBubbleSort(5);
			Algoritmos.chamaBubbleSort(10);
			Algoritmos.chamaBubbleSort(50);
			Algoritmos.chamaBubbleSort(100);
			Algoritmos.chamaBubbleSort(1000);
			Algoritmos.chamaBubbleSort(10000);

			Algoritmos.chamaMergeSort(5);
			Algoritmos.chamaMergeSort(10);
			Algoritmos.chamaMergeSort(50);
			Algoritmos.chamaMergeSort(100);
			Algoritmos.chamaMergeSort(1000);
			Algoritmos.chamaMergeSort(10000);

			Algoritmos.chamaQuickSort(5);
			Algoritmos.chamaQuickSort(10);
			Algoritmos.chamaQuickSort(50);
			Algoritmos.chamaQuickSort(100);
			Algoritmos.chamaQuickSort(1000);
			Algoritmos.chamaQuickSort(10000);

			Algoritmos.chamaHeapSort(5);
			Algoritmos.chamaHeapSort(10);
			Algoritmos.chamaHeapSort(50);
			Algoritmos.chamaHeapSort(100);
			Algoritmos.chamaHeapSort(1000);
			Algoritmos.chamaHeapSort(10000);

			Algoritmos.chamaCountingSort(5);
			Algoritmos.chamaCountingSort(10);
			Algoritmos.chamaCountingSort(50);
			Algoritmos.chamaCountingSort(100);
			Algoritmos.chamaCountingSort(1000);
			Algoritmos.chamaCountingSort(10000);

			Algoritmos.chamaRadixSort(5);
			Algoritmos.chamaRadixSort(10);
			Algoritmos.chamaRadixSort(50);
			Algoritmos.chamaRadixSort(100);
			Algoritmos.chamaRadixSort(1000);
			Algoritmos.chamaRadixSort(10000);

			Algoritmos.chamaBucketSort(5);
			Algoritmos.chamaBucketSort(10);
			Algoritmos.chamaBucketSort(50);
			Algoritmos.chamaBucketSort(100);
			Algoritmos.chamaBucketSort(1000);
			Algoritmos.chamaBucketSort(10000);
		}
	}

	public static void main(String[] args) {
		testaAlgoritmos();
	}
}
