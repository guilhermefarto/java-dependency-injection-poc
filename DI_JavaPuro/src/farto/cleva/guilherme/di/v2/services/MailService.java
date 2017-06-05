package farto.cleva.guilherme.di.v2.services;

public class MailService {

	public boolean sendMail(String from, String to, String message) {
		System.out.println(from + " enviou um e-mail para " + to + " : \"" + message + "\"");

		return true;
	}

}
