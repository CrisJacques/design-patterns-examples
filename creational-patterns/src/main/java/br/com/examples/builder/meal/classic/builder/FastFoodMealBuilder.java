package br.com.examples.builder.meal.classic.builder;

import br.com.examples.builder.meal.classic.model.FastFoodMeal;

/**
 * Como cada builder terá sua própria forma de construir o objeto FastFoodMeal, todos os métodos desta classe
 * são abstratos
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
	
	public abstract void buildDrink();
	public abstract void buildMain();
	public abstract void buildSide();
	public abstract void buildDessert();
	public abstract void buildGift();
}
