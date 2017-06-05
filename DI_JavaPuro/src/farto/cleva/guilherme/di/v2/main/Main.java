package farto.cleva.guilherme.di.v2.main;

import farto.cleva.guilherme.di.v2.app.Application;
import farto.cleva.guilherme.di.v2.services.MailService;

public class Main {

	public static void main(String[] args) {

		String from = "Guilherme";
		String to = "Joana";
		String message = "Olá, tudo bem?";

		Application app = new Application(new MailService());
		// Application app = new Application(new FacebookService());

		app.processMessage(from, to, message);

	}

}
