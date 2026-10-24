package br.com.examples.factory.classic;

import br.com.examples.factory.classic.factory.IPhone11ProFactory;
import br.com.examples.factory.classic.factory.IPhoneFactory;
import br.com.examples.factory.classic.factory.IPhoneXFactory;
import br.com.examples.factory.classic.model.IPhone;

public class Client {

	/**
	 * Nessa versão clássica do padrão Factory Method, o cliente precisa saber qual fábrica chamar, pois cada tipo
	 * de produto tem sua própria Factory (e dentro dela o Factory Method). Essa versão é mais complexa, mas pode ser
	 * a mais adequada dependendo do caso de uso.
	 */
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
