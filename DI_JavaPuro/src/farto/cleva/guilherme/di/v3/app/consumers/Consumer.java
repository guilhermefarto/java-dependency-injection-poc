package farto.cleva.guilherme.di.v3.app.consumers;

public interface Consumer {

	public boolean processMessage(String from, String to, String message);

}
