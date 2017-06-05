package farto.cleva.guilherme.di.v2.app;

import farto.cleva.guilherme.di.v2.services.FacebookService;
import farto.cleva.guilherme.di.v2.services.MailService;

public class Application {

	private MailService mailService = null;
	private FacebookService facebookService = null;

	public Application(MailService mailService) {
		this.mailService = mailService;
	}

	public Application(FacebookService facebookService) {
		this.facebookService = facebookService;
	}

	public boolean processMessage(String from, String to, String message) {
		boolean result = false;

		if (this.mailService != null) {
			result = this.mailService.sendMail(from, to, message);
		}

		if (this.facebookService != null) {
			result = this.facebookService.sendChat(from, to, message);
		}

		return result;
	}

}
