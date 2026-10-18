package br.com.examples.command.alexa.lights;

/**
 * Classe concreta de destinatário dos comandos. Traz sua própria implementação de turnOn() e turnOff(),
 * obrigatórios pelo fato de implementar a interface GenericLight.
 */
public class PhillipsHueLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The PhillipsHueLight is On");
	}
	
	public void turnOff() {
		System.out.println("The PhillipsHueLight is Off");
	}
}
