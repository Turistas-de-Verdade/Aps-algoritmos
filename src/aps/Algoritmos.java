package aps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Algoritmos {
	static Long tempoInicialInsertion;
	static Long tempoFinalInsertion;
	static Long tempoDeExecInsertion;

	static Long tempoInicialSelection;
	static Long tempoFinalSelection;
	static Long tempoDeExecSelection;

	static Long tempoInicialBubble;
	static Long tempoFinalBubble;
	static Long tempoDeExecBubble;

	static Long tempoInicialQuick;
	static Long tempoFinalQuick;
	static Long tempoDeExecQuick;

	static Long tempoInicialHeap;
	static Long tempoFinalHeap;
	static Long tempoDeExecHeap;

	static Long tempoInicialMerge;
	static Long tempoFinalMerge;
	static Long tempoDeExecMerge;

	static Long tempoInicialCounting;
	static Long tempoFinalCounting;
	static Long tempoDeExecCounting;

	static Long tempoInicialRadix;
	static Long tempoFinalRadix;
	static Long tempoDeExecRadix;

	static Long tempoInicialBucket;
	static Long tempoFinalBucket;
	static Long tempoDeExecBucket;

	private static final int VALOR_MAX = 100;
	private static final int TAM_BALDE = 15;

	public static void populaArray(int array[]) {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (r.nextInt(VALOR_MAX) + 1);
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

	public static Long chamaSelectionSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialSelection = System.nanoTime();
		selectionSort(array);
		tempoFinalSelection = System.nanoTime();

		tempoDeExecSelection = tempoExec(tempoFinalSelection, tempoInicialSelection);
		return tempoDeExecSelection;
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

	public static Long chamaInsertionSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialInsertion = System.nanoTime();
		insertionSort(array);
		tempoFinalInsertion = System.nanoTime();

		tempoDeExecInsertion = tempoExec(tempoFinalInsertion, tempoInicialInsertion);
		return tempoDeExecInsertion;
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

	public static Long chamaBubbleSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialBubble = System.nanoTime();
		bubbleSort(array);
		tempoFinalBubble = System.nanoTime();

		tempoDeExecBubble = tempoExec(tempoFinalBubble, tempoInicialBubble);
		return tempoDeExecBubble;
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

	public static Long chamaMergeSort(int tamArray) {
		int array[] = new int[tamArray];
		int arrayAux[] = new int[array.length];

		populaArray(array);

		tempoInicialMerge = System.nanoTime();
		mergeSort(array, arrayAux, 0, (array.length - 1));
		tempoFinalMerge = System.nanoTime();

		tempoDeExecMerge = tempoExec(tempoFinalMerge, tempoInicialMerge);
		return tempoDeExecMerge;

	}

	/******************************************************************/

	/** QUICK SORT */
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

	public static Long chamaQuickSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialQuick = System.nanoTime();
		quickSort(array, 0, (array.length - 1));
		tempoFinalQuick = System.nanoTime();

		tempoDeExecQuick = tempoExec(tempoFinalQuick, tempoInicialQuick);
		return tempoDeExecQuick;

	}

	/***********************************************************************/

	/** HEAP SORT */

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

	public static Long chamaHeapSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialHeap = System.nanoTime();
		heapSort(array);
		tempoFinalHeap = System.nanoTime();

		tempoDeExecHeap = tempoExec(tempoFinalHeap, tempoInicialHeap);
		return tempoDeExecHeap;
	}

	/*********************************************/

	/** COUTING SORT */

	public static void countingSort(int[] array, int max) {
		int arrayAux[] = new int[max + 1];
		for (int i : array) {
			arrayAux[i]++;
		}

		int j = 0;
		for (int i = 0; i < arrayAux.length; i++) {
			while (0 < arrayAux[i]) {
				array[j++] = i;
				arrayAux[i]--;
			}
		}
	}

	public static Long chamaCountingSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialCounting = System.nanoTime();
		countingSort(array, VALOR_MAX);
		tempoFinalCounting = System.nanoTime();

		tempoDeExecCounting = tempoExec(tempoFinalCounting, tempoInicialCounting);
		return tempoDeExecCounting;

	}

	/*********************************************/

	/** RADIX SORT */

	public static void radixSort(int array[]) {
		Integer maior = encontraMaior(array);

		int casasMaior = maior.toString().length();

		for (int casa = 1; casa <= casasMaior; casa++) {
			ArrayList<Integer> arrayList[] = new ArrayList[10];

			for (int i = 0; i < arrayList.length; i++) {
				arrayList[i] = new ArrayList<Integer>();
			}

			for (int num : array) {
				int mod = (int) Math.pow(10, casa);
				int div = (int) mod / 10;
				int lsd = (num % mod) / div;

				arrayList[lsd].add(num);

			}

			ArrayList<Integer> arrayListAux = new ArrayList<Integer>();
			for (ArrayList<Integer> ls : arrayList) {
				for (Integer x : ls) {
					arrayListAux.add(x);
				}
			}
			for (int i = 0; i < arrayListAux.size(); i++) {
				array[i] = arrayListAux.get(i);
			}

		}

	}

	public static Integer encontraMaior(int array[]) {
		Integer maior = 0;

		for (int i = 0; i < array.length; i++) {
			maior = (array[i] > maior) ? array[i] : maior;
		}

		return maior;
	}

	public static Long chamaRadixSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialRadix = System.nanoTime();
		radixSort(array);
		tempoFinalRadix = System.nanoTime();

		tempoDeExecRadix = tempoExec(tempoFinalRadix, tempoInicialRadix);
		return tempoDeExecRadix;
	}

	/***********************************************/

	/** BUCKET SORT */

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

	public static Long chamaBucketSort(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		tempoInicialBucket = System.nanoTime();
		bucketSort(array, TAM_BALDE);
		tempoFinalBucket = System.nanoTime();
		tempoDeExecBucket = tempoExec(tempoFinalBucket, tempoInicialBucket);
		return tempoDeExecBucket;
	}

	/************************************************/

	public static Long tempoExec(Long tFinal, Long tInicial) {
		Long tempoDeExec = (tFinal - tInicial);

		return tempoDeExec;
	}

}
