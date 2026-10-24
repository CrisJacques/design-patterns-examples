package br.com.examples.factory.classic.factory;

import br.com.examples.factory.classic.model.IPhone;

/**
 * Classe abstrata para as Factories que serão criadas (uma para cada tipo de iPhone)
 */
public abstract class IPhoneFactory {

	public IPhone orderIPhone() {
		IPhone device = null;
		
		device = createIPhone();
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
		
		return device;
	}

	/**
	 * Como cada Factory vai criar um iPhone de um jeito diferente, esse método precisa ser abstrato
	 */
	protected abstract IPhone createIPhone();
}
