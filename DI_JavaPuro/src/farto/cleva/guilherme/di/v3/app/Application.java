package farto.cleva.guilherme.di.v3.app;

import farto.cleva.guilherme.di.v3.app.consumers.Consumer;
import farto.cleva.guilherme.di.v3.services.interfaces.MessageService;

public class Application implements Consumer {

	private MessageService messageService = null;

	public Application(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public boolean processMessage(String from, String to, String message) {
		boolean result = this.messageService.sendMessage(from, to, message);

		return result;
	}

}
