package br.com.examples.decorator.coffeeShop.model.decorators;

import br.com.examples.decorator.coffeeShop.model.Drink;

/**
 * Todos os Decorators herdam desta classe abstrata, que também segue a mesma interface das classes alvo.
 */
public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}