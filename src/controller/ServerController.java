package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import controller.algoritmos.BubbleSort;
import controller.algoritmos.HeapSort;
import controller.algoritmos.SelectionSort;

public class ServerController {

	private int port;
	private ServerSocket listen;
	private ObjectOutputStream outputStream;
	private ObjectInputStream inputStream;
	private boolean onAir = true;
	private String[] param;

	public ServerController(int port) {
		this.port = port;
		conecta();
	}

	private void conecta() {
		try {
			listen = new ServerSocket(port, 10);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("Server listen port:" + port);
	}

	public void retorno() throws IOException {
		Socket client = null;
		while (onAir) {
			try {
				client = listen.accept();
				outputStream = new ObjectOutputStream(client.getOutputStream());
				inputStream = new ObjectInputStream(client.getInputStream());

				param = (String[]) inputStream.readObject();
				outputStream.flush();
				outputStream.writeObject(algoritmo(param));
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
			}
		}
		inputStream.close();
		outputStream.close();
		client.close();

	}

	private String algoritmo(String[] param) {
		if (param[0].contains("Bubble")) {
			if (param[1].contains("Int")) {
				return BubbleSort.bubbleSortInt(param[2]);
			}
			if (param[1].contains("Float")) {
				return BubbleSort.bubbleSortFloat(param[2]);
			}
			if (param[1].contains("String")) {
				return BubbleSort.bubbleSortString(param[2]);
			}
			if (param[1].contains("Object")) {
				return BubbleSort.bubbleSortObject(param[2]);
			}
		}
		if (param[0].contains("Heap")) {
			if (param[1].contains("Int")) {
				return HeapSort.heapSortInt(param[2]);
			}
			if (param[1].contains("Float")) {
				return HeapSort.heapSortFloat(param[2]);
			}
			if (param[1].contains("String")) {
				return HeapSort.heapSortString(param[2]);
			}
			if (param[1].contains("Object")) {
				return HeapSort.heapSortObject(param[2]);
			}
		}
		if (param[0].contains("Selection")) {
			if (param[1].contains("Int")) {
				return SelectionSort.selectionSortInt(param[2]);
			}
			if (param[1].contains("Float")) {
				return SelectionSort.selectionSortFloat(param[2]);
			}
			if (param[1].contains("String")) {
				return SelectionSort.selectionSortString(param[2]);
			}
			if (param[1].contains("Object")) {
				return SelectionSort.selectionSortObject(param[2]);
			}
		}
		return null;
	}
}
