package br.com.examples.builder.classic;

import br.com.examples.builder.classic.builder.*;
import br.com.examples.builder.classic.builder.*;
import br.com.examples.builder.classic.director.MealDirector;

/**
 * Classe cliente que utiliza a classe diretora para construir diversos tipos de FastFoodMeal. Conhece apenas a classe
 * diretora e os builders, mas não conhece os detalhes da construção dos objetos.
 */
public class Client {
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}