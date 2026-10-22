package br.com.examples.builder.meal.fluent.model.builder;

import br.com.examples.builder.meal.fluent.model.FastFoodMeal;

/**
 * Builder de refeições. Diferentemente do exemplo 1, este Builder é bem mais genérico, permitindo construir uma
 * grande variedade de refeições sem precisar da criação de várias classes Builder diferentes.
 *
 * Como cada método retorna o próprio objeto, isso permite encadear as suas chamadas no cliente, tornando o código
 * bem fácil de ler e entender (fluent API).
 */
public class FastFoodMealBuilder {
	//Mandatory
	private String side;
	
	//Optionals
	private String drink;
	private String main;
	private String dessert;
	private String gift;
	
	public FastFoodMealBuilder(String side) {
		this.side = side;
	}

	public FastFoodMealBuilder forDrink(String drink) {
		this.drink = drink;
		return this;
	}
	
	public FastFoodMealBuilder andMain(String main) {
		this.main = main;
		return this;
	}

	public FastFoodMealBuilder andDessert(String dessert) {
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder andGift(String gift) {
		this.gift = gift;
		return this;
	}

	/**
	 * Retorna o objeto construído
	 */
	public FastFoodMeal thatsAll() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
	}
}
