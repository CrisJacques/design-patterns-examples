package br.com.examples.command.alexa.lights;

/**
 * Neste caso, todo destinatário dos comandos deve ter no mínimo os métodos turnOn() e turnOff()
 */
public interface GenericLight {
	void turnOn();
	void turnOff();
}
