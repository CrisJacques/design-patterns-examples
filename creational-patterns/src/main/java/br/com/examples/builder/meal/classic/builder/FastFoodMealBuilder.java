package br.com.examples.builder.meal.classic.builder;

import br.com.examples.builder.meal.classic.model.FastFoodMeal;

/**
 * Como cada builder terá sua própria forma de construir o objeto FastFoodMeal, todos os métodos desta classe
 * possuem implementação vazia. Uma alternativa seria fazê-los ser abstratos, mas a desvantagem disso é que em
 * builders concretos em que não faz sentido ter esses métodos teríamos que ter uma implementação vazia dentro
 * da classe.
 */
public abstract class FastFoodMealBuilder {
	protected FastFoodMeal meal;

	/**
	 * Inicializa um objeto "vazio" para depois ser "preenchido" por cada um dos métodos
	 */
	public FastFoodMealBuilder() {
		meal = new FastFoodMeal();
	}

	/**
	 * Retorna o objeto construído
	 */
	public FastFoodMeal getMeal() {
		return meal;
	}
	
	public void buildDrink() {};
	public void buildMain() {};
	public void buildSide() {};
	public void buildDessert() {};
	public void buildGift() {};
}
