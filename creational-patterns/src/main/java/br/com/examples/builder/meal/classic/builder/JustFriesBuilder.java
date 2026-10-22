package br.com.examples.builder.meal.classic.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

	@Override
	public void buildSide() {
		meal.setSide("Large Fries");
	}

}
