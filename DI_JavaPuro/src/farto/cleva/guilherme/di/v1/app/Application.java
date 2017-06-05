package farto.cleva.guilherme.di.v1.app;

import farto.cleva.guilherme.di.v1.services.MailService;

public class Application {

	private MailService mailService = new MailService();
	// private FacebookService facebookService = new FacebookService();

	public boolean processMessage(String from, String to, String message) {
		boolean result = this.mailService.sendMail(from, to, message);
		// boolean result = this.facebookService.sendChat(from, to, message);

		return result;
	}

}
