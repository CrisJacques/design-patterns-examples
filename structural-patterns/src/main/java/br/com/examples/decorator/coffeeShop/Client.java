package br.com.examples.decorator.coffeeShop;

import br.com.examples.decorator.coffeeShop.model.Drink;
import br.com.examples.decorator.coffeeShop.model.Expresso;
import br.com.examples.decorator.coffeeShop.model.Tea;
import br.com.examples.decorator.coffeeShop.model.decorators.DoubleDrink;
import br.com.examples.decorator.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.printf("Drink price: R$ %.2f\n", drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso()); // classe alvo pura
		order("Tea", new Tea()); // classe alvo pura
		order("Lungo", new DoubleDrink(new Expresso())); // aplicando o Decorator DoubleDrink
		order("Cafe Au Lait", new Milk(new Expresso())); // aplicando o Decorator Milk
		order("English Tea", new Milk(new Tea()));// aplicando o Decorator Milk em outra classe

		// A ordem de aplicação dos Decorators importa, veja os exemplos abaixo
		order("Double English Tea", new DoubleDrink(new Milk(new Tea()))); // aplicando dois Decorators em uma ordem
		order("Double Tea With Milk", new Milk(new DoubleDrink(new Tea()))); // aplicando dois Decorators em outra ordem
	}
}
