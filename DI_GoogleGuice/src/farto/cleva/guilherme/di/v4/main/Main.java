package farto.cleva.guilherme.di.v4.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import farto.cleva.guilherme.di.v4.app.Application;
import farto.cleva.guilherme.di.v4.app.injectors.MessageServiceInjector;

public class Main {

	public static void main(String[] args) {

		String from = "Guilherme";
		String to = "Joana";
		String message = "Olá, tudo bem?";

		Injector injector = Guice.createInjector(new MessageServiceInjector());

		Application app = injector.getInstance(Application.class);

		app.processMessage(from, to, message);

	}

}
