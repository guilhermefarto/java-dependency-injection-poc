package farto.cleva.guilherme.di.v3.services;

import farto.cleva.guilherme.di.v3.services.interfaces.MessageService;

public class MailService implements MessageService {

	@Override
	public boolean sendMessage(String from, String to, String message) {
		System.out.println(from + " enviou um e-mail para " + to + " : \"" + message + "\"");

		return true;
	}

}
