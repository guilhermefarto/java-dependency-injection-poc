package farto.cleva.guilherme.di.v3.services.injectors;

import farto.cleva.guilherme.di.v3.app.Application;
import farto.cleva.guilherme.di.v3.app.consumers.Consumer;
import farto.cleva.guilherme.di.v3.app.injectors.MessageServiceInjector;
import farto.cleva.guilherme.di.v3.services.MailService;

public class MailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new Application(new MailService());
	}

}
