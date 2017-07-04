package controller.algoritmos;

import model.Cliente;

import com.google.gson.Gson;

public class BubbleSort {

	public static String bubbleSortInt(String array) {
		int[] vetor = new Gson().fromJson(array, int[].class);
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
		return new Gson().toJson(vetor);
	}

	public static String bubbleSortFloat(String array) {
		float[] vetor = new Gson().fromJson(array, float[].class);
		boolean troca = true;
		float aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}

		return new Gson().toJson(vetor);
	}

	public static String bubbleSortObject(String array) {
		Cliente[] vetor = new Gson().fromJson(array, Cliente[].class);
		boolean troca = true;
		Cliente aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i].getId() > vetor[i + 1].getId()) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}

		return new Gson().toJson(vetor);// Arrays.toString(vetor);//
	}

	public static String bubbleSortString(String array) {
		Cliente[] vetor = new Gson().fromJson(array, Cliente[].class);
		boolean troca = true;
		Cliente aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i].getId() > vetor[i + 1].getId()) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}

		return new Gson().toJson(vetor);// Arrays.toString(vetor);//
	}

}
