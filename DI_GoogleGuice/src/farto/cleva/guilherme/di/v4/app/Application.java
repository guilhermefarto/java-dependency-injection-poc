package farto.cleva.guilherme.di.v4.app;

import com.google.inject.Inject;
import farto.cleva.guilherme.di.v4.services.interfaces.MessageService;

public class Application {

	private MessageService messageService = null;

	/**
	 * Google Guice support both [constructor-based] and [setter-based]
	 * dependency injection
	 */
	@Inject
	public Application(MessageService messageService) {
		this.messageService = messageService;
	}

	public boolean processMessage(String from, String to, String message) {
		boolean result = this.messageService.sendMessage(from, to, message);

		return result;
	}

}
