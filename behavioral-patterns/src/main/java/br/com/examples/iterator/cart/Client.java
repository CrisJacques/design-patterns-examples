package br.com.examples.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

	public static void main(String[] args) {
		Cart cart = new Cart(new Product("TV", 1000d), new Product("Shoe", 59.99d), new Product("Pencil", 0.5d));

		/**
		 * É possível fazer for each em cima do cart justamente porque ele implementa a interface Iterable. O iterador
		 * criado sabe que ele deve iterar em cima dos produtos. O fato de a lista de produtos ser um atributo private
		 * não impede a iteração em cima dos produtos. Dessa forma, estamos protegendo a coleção de alterações indevidas,
		 * expondo apenas o iterador.
		 */
		for(Product prod: cart) {
			System.out.println(String.format("%s = %.2f", prod.getDesc(), prod.getValue()));
		}

		/**
		 * Aqui conseguimos criar um stream a partir do spliterator em cima do cart também porque ele implementa a
		 * interface iterable
		 */
		Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = stream.reduce(0d, (acc, prod) -> acc + prod.getValue(), Double::sum);
		System.out.println(sum);
	}
}
