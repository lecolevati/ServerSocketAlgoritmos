package controller.algoritmos;

import java.util.Arrays;

import model.Cliente;

import com.google.gson.Gson;

public class HeapSort {

	public static String heapSortInt(String array) {
		int[] vetor = new Gson().fromJson(array, int[].class);

		buildheapInt(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			int temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			heapifyInt(vetor, i, 0);
		}

		return Arrays.toString(vetor);
	}

	private static void heapifyInt(int vetor[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n) {
			if (vetor[child] > vetor[max]) {
				max = child;
			}
		}
		if (child + 1 < n) {
			if (vetor[child + 1] > vetor[max]) {
				max = child + 1;
			}
		}
		if (max != i) {
			int temp = vetor[i];
			vetor[i] = vetor[max];
			vetor[max] = temp;
			heapifyInt(vetor, n, max);
		}
	}

	private static void buildheapInt(int vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			heapifyInt(vetor, vetor.length, i);
		}
	}

	public static String heapSortFloat(String array) {
		float[] vetor = new Gson().fromJson(array, float[].class);

		buildheapFloat(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			float temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			heapifyFloat(vetor, i, 0);
		}

		return new Gson().toJson(vetor);
	}

	private static void heapifyFloat(float vetor[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n) {
			if (vetor[child] > vetor[max]) {
				max = child;
			}
		}
		if (child + 1 < n) {
			if (vetor[child + 1] > vetor[max]) {
				max = child + 1;
			}
		}
		if (max != i) {
			float temp = vetor[i];
			vetor[i] = vetor[max];
			vetor[max] = temp;
			heapifyFloat(vetor, n, max);
		}
	}

	private static void buildheapFloat(float vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			heapifyFloat(vetor, vetor.length, i);
		}
	}

	public static String heapSortObject(String array) {
		Cliente[] vetor = new Gson().fromJson(array, Cliente[].class);

		buildheapObject(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			Cliente temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			heapifyObject(vetor, i, 0);
		}

		return new Gson().toJson(vetor);
	}

	private static void heapifyObject(Cliente vetor[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n) {
			if (vetor[child].getId() > vetor[max].getId()) {
				max = child;
			}
		}
		if (child + 1 < n) {
			if (vetor[child + 1].getId() > vetor[max].getId()) {
				max = child + 1;
			}
		}
		if (max != i) {
			Cliente temp = vetor[i];
			vetor[i] = vetor[max];
			vetor[max] = temp;
			heapifyObject(vetor, n, max);
		}
	}

	private static void buildheapObject(Cliente vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			heapifyObject(vetor, vetor.length, i);
		}
	}

	public static String heapSortString(String array) {
		String[] vetor = new Gson().fromJson(array, String[].class);

		buildheapString(vetor);
		for (int i = vetor.length - 1; i >= 1; i--) {
			String temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			heapifyString(vetor, i, 0);
		}

		return new Gson().toJson(vetor);
	}

	private static void heapifyString(String vetor[], int n, int i) {
		int max, child;
		child = 2 * i + 1;
		max = i;
		if (child < n) {
			if (vetor[child].compareTo(vetor[max]) > 0) {
				max = child;
			}
		}
		if (child + 1 < n) {
			if (vetor[child + 1].compareTo(vetor[max]) > 0) {
				max = child + 1;
			}
		}
		if (max != i) {
			String temp = vetor[i];
			vetor[i] = vetor[max];
			vetor[max] = temp;
			heapifyString(vetor, n, max);
		}
	}

	private static void buildheapString(String vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--) {
			heapifyString(vetor, vetor.length, i);
		}
	}

}
