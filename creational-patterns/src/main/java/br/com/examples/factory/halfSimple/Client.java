package br.com.examples.factory.halfSimple;

import br.com.examples.factory.halfSimple.factory.IPhone11Factory;
import br.com.examples.factory.halfSimple.factory.IPhoneFactory;
import br.com.examples.factory.halfSimple.factory.IPhoneXFactory;
import br.com.examples.factory.halfSimple.model.IPhone;

public class Client {

	/**
	 * Neste caso, o cliente ainda precisa saber qual Factory chamar, mas ele depende de uma quantidade menor de classes,
	 * diminuindo a complexidade do sistema.
	 */
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
