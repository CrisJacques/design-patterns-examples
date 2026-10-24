package br.com.examples.builder.classic.director;

import br.com.examples.builder.classic.builder.FastFoodMealBuilder;
import br.com.examples.builder.classic.model.FastFoodMeal;

/**
 * A classe diretora é opcional. Quando existir, é ela quem irá definir a ordem dos passos de construção do objeto.
 * Quando ela não existir, o próprio cliente pode chamar os passos de construção da forma que preferir. A implementação
 * mais clássica do padrão Builder (livro do GOF) usa a classe diretora.
 *
 * Como todos os builders deste exemplo herdam da mesma classe abstrata, os métodos da classe diretora são compatíveis
 * com qualquer builder.
 */
public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
