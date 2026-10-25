package br.com.examples.abstractfactory.apple;

import br.com.examples.abstractfactory.apple.factory.IPhone11Factory;
import br.com.examples.abstractfactory.apple.factory.IPhoneFactory;
import br.com.examples.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.examples.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.examples.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.examples.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.examples.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRules = new USRulesAbstractFactory();

		IPhoneFactory genXFactory = new IPhoneXFactory(brazilianRules);
		IPhoneFactory gen11Factory = new IPhone11Factory(usRules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
