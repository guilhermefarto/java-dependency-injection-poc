package farto.cleva.guilherme.di.v3.services;

import farto.cleva.guilherme.di.v3.services.interfaces.MessageService;

public class FacebookService implements MessageService {

	@Override
	public boolean sendMessage(String from, String to, String message) {
		System.out.println(from + " enviou uma mensagem pelo Facebook para " + to + " : \"" + message + "\"");

		return true;
	}

}
