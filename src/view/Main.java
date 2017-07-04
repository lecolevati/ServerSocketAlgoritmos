package view;

import java.io.IOException;

import controller.ServerController;

public class Main {

	public static void main(String[] args) {
		int port = 12345;
		ServerController stc = new ServerController(port);
		try {
			stc.retorno();
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
}
