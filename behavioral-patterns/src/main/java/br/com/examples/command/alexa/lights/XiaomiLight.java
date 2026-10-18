package br.com.examples.command.alexa.lights;

/**
 * Classe concreta de destinatário dos comandos. Traz sua própria implementação de turnOn() e turnOff(),
 * obrigatórios pelo fato de implementar a interface GenericLight.
 */
public class XiaomiLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The XiaomiLight is On");
	}
	
	public void turnOff() {
		System.out.println("The XiaomiLight is Off");
	}
}
