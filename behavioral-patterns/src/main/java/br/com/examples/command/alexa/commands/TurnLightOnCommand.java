package br.com.examples.command.alexa.commands;

import br.com.examples.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	/**
	 * Referência para o destinatário do comando, que é quem realmente executará o trabalho. Todo Command
	 * deve ter.
	 */
	private GenericLight light;
	
	
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// Evitando NullPointerException
		if(light != null) {
			light.turnOn();// Neste caso, está simplesmente chamando o destinatário. Caso houvesse alguma
			// complexidade adicional, ela ficaria aqui também, dessa forma fazendo com que o cliente não
			// precise conhecer esses detalhes.
		}

	}
}
