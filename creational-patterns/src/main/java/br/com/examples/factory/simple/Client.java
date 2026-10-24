package br.com.examples.factory.simple;

import br.com.examples.factory.simple.factory.IPhoneSimpleFactory;
import br.com.examples.factory.simple.model.IPhone;

public class Client {

	/**
	 * Com o uso do Simple Factory, o código do cliente ficou muito mais simples e enxuto.
	 */
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
