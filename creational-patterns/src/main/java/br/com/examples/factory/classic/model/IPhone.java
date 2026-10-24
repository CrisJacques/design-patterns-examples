package br.com.examples.factory.classic.model;

/**
 * Classe abstrata para todos os tipos de iPhone
 */
public abstract class IPhone {

	/**
	 * Como cada iPhone tem um conjunto de especificações de hardware diferente, esse método precisa ser abstrato
	 */
	public abstract void getHardware();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}
}
