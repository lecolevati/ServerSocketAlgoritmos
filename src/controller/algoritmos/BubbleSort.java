package controller.algoritmos;

import com.google.gson.Gson;

public class BubbleSort {

	public static String sortInt(String array) {
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

}
