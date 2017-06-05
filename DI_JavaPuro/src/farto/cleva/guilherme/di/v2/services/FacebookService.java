package farto.cleva.guilherme.di.v2.services;

public class FacebookService {

	public boolean sendChat(String from, String to, String message) {
		System.out.println(from + " enviou uma mensagem pelo Facebook para " + to + " : \"" + message + "\"");

		return true;
	}

}
