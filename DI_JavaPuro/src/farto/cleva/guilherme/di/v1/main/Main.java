package farto.cleva.guilherme.di.v1.main;

import farto.cleva.guilherme.di.v1.app.Application;

public class Main {

	public static void main(String[] args) {

		String from = "Guilherme";
		String to = "Joana";
		String message = "Olá, tudo bem?";

		Application app = new Application();

		app.processMessage(from, to, message);

	}

}
