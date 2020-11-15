package aps;

import java.util.ArrayList;
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

	public static void radisSort(int array[]) {
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

	public static void chamaRadix(int tamArray) {
		int array[] = new int[tamArray];

		populaArray(array);

		System.out.println("Array antes do Radix Sort:");
		System.out.println(Arrays.toString(array));

		radisSort(array);

		System.out.println("Array depois do Radix Sort:");
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		chamaRadix(15);
	}
}
