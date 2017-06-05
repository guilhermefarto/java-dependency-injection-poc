package farto.cleva.guilherme.di.v4.services;

/**
 * Google Guice 3.0 added the support for JSR-330 and we can use annotations from com.google.inject or javax.inject package
 * 
 * import javax.inject.Singleton;
 */
import com.google.inject.Singleton;
import farto.cleva.guilherme.di.v4.services.interfaces.MessageService;

@Singleton
public class FacebookService implements MessageService {

	@Override
	public boolean sendMessage(String from, String to, String message) {
		System.out.println(from + " enviou uma mensagem pelo Facebook para " + to + " : \"" + message + "\"");

		return true;
	}

}
