package controller.algoritmos;

import java.util.Arrays;

import model.Cliente;

import com.google.gson.Gson;

public class SelectionSort {

	public static String selectionSortInt(String array) {
		int[] vetor = new Gson().fromJson(array, int[].class);
		int menor;
		int indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			menor = vetor[i];
			indiceMenor = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}

		return Arrays.toString(vetor);
	}

	public static String selectionSortFloat(String array) {
		float[] vetor = new Gson().fromJson(array, float[].class);
		float menor;
		int indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			menor = vetor[i];
			indiceMenor = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}

		return new Gson().toJson(vetor);
	}

	public static String selectionSortObject(String array) {
		Cliente[] vetor = new Gson().fromJson(array, Cliente[].class);
		Cliente menor;
		int indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			menor = vetor[i];
			indiceMenor = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j].getId() < menor.getId()) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}

		return new Gson().toJson(vetor);
	}

	public static String selectionSortString(String array) {
		String[] vetor = new Gson().fromJson(array, String[].class);
		String menor;
		int indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			menor = vetor[i];
			indiceMenor = i;

			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j].compareTo(menor) < 0) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}

		return new Gson().toJson(vetor);
	}
	
}
