package br.com.examples.factory.halfSimple.factory;

import br.com.examples.factory.halfSimple.model.IPhone;

/**
 * Classe abstrata que será a base para todas as Factories (mesma implementação do exemplo 1)
 */
public abstract class IPhoneFactory {

	public IPhone orderIPhone(String level) {
		IPhone device = null;
		
		device = createIPhone(level);
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}
	
	protected abstract IPhone createIPhone(String level);
}
