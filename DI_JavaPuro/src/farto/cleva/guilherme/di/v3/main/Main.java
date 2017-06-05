package farto.cleva.guilherme.di.v3.main;

import farto.cleva.guilherme.di.v3.app.consumers.Consumer;
import farto.cleva.guilherme.di.v3.app.injectors.MessageServiceInjector;
import farto.cleva.guilherme.di.v3.services.injectors.FacebookServiceInjector;
import farto.cleva.guilherme.di.v3.services.injectors.MailServiceInjector;

public class Main {

	public static void main(String[] args) {

		String from = "Guilherme";
		String to = "Joana";
		String message = "Olá, tudo bem?";

		MessageServiceInjector injector = new MailServiceInjector();

		Consumer app = injector.getConsumer();

		app.processMessage(from, to, message);

		injector = new FacebookServiceInjector();

		app = injector.getConsumer();

		app.processMessage(from, to, message);

	}

}
