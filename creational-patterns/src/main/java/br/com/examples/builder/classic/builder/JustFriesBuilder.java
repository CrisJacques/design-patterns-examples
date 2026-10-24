package br.com.examples.builder.classic.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

	@Override
	public void buildSide() {
		meal.setSide("Large Fries");
	}

}
