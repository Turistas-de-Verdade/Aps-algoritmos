package aps;

import java.util.Map;

public class ApsApplication {

	static Map<String, Long> tempoDeExecMap;

	public static void testaAlgoritmos() {
		for (int i = 0; i < 50; i++) {

			tempoDeExecMap.put("Insertion de tamanho 5", Algoritmos.chamaInsertionSort(5));
			tempoDeExecMap.put("Insertion de tamanho 10", Algoritmos.chamaInsertionSort(10));
			tempoDeExecMap.put("Insertion de tamanho 50", Algoritmos.chamaInsertionSort(50));
			tempoDeExecMap.put("Insertion de tamanho 100", Algoritmos.chamaInsertionSort(100));
			tempoDeExecMap.put("Insertion de tamanho 1000", Algoritmos.chamaInsertionSort(1000));
			tempoDeExecMap.put("Insertion de tamanho 10000", Algoritmos.chamaInsertionSort(10000));

			tempoDeExecMap.put("Selection de tamanho 5 ", Algoritmos.chamaSelectionSort(5));
			tempoDeExecMap.put("Selection de tamanho 10 ", Algoritmos.chamaSelectionSort(10));
			tempoDeExecMap.put("Selection de tamanho 50 ", Algoritmos.chamaSelectionSort(50));
			tempoDeExecMap.put("Selection de tamanho 100 ", Algoritmos.chamaSelectionSort(100));
			tempoDeExecMap.put("Selection de tamanho 1000 ", Algoritmos.chamaSelectionSort(1000));
			tempoDeExecMap.put("Selection de tamanho 10000 ", Algoritmos.chamaSelectionSort(10000));

			tempoDeExecMap.put("Bubble de tamanho 5", Algoritmos.chamaBubbleSort(5));
			tempoDeExecMap.put("Bubble de tamanho 10", Algoritmos.chamaBubbleSort(10));
			tempoDeExecMap.put("Bubble de tamanho 50", Algoritmos.chamaBubbleSort(50));
			tempoDeExecMap.put("Bubble de tamanho 100", Algoritmos.chamaBubbleSort(100));
			tempoDeExecMap.put("Bubble de tamanho 1000", Algoritmos.chamaBubbleSort(1000));
			tempoDeExecMap.put("Bubble de tamanho 10000", Algoritmos.chamaBubbleSort(10000));

			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(5));
			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(10));
			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(50));
			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(100));
			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(1000));
			tempoDeExecMap.put("Merge de tamanho ", Algoritmos.chamaMergeSort(10000));

			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(5));
			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(10));
			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(50));
			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(100));
			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(1000));
			tempoDeExecMap.put(i, Algoritmos.chamaQuickSort(10000));

			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(5));
			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(10));
			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(50));
			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(100));
			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(1000));
			tempoDeExecMap.put(i, Algoritmos.chamaHeapSort(10000));

			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(5));
			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(10));
			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(50));
			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(100));
			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(1000));
			tempoDeExecMap.put(i, Algoritmos.chamaCountingSort(10000));

			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(5));
			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(10));
			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(50));
			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(100));
			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(1000));
			tempoDeExecMap.put(i, Algoritmos.chamaRadixSort(10000));

			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(5));
			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(10));
			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(50));
			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(100));
			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(1000));
			tempoDeExecMap.put(i, Algoritmos.chamaBucketSort(10000));
		}

	}

	public static void main(String[] args) {
		testaAlgoritmos();

		System.out.println(tempoDeExecMap);
	}
}
