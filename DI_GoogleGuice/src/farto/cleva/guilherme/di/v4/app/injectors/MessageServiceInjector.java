package farto.cleva.guilherme.di.v4.app.injectors;

import com.google.inject.AbstractModule;
import farto.cleva.guilherme.di.v4.services.MailService;
import farto.cleva.guilherme.di.v4.services.interfaces.MessageService;

public class MessageServiceInjector extends AbstractModule {

	@Override
	protected void configure() {
		bind(MessageService.class).to(MailService.class);
		// bind(MessageService.class).to(FacebookService.class);
	}

}
