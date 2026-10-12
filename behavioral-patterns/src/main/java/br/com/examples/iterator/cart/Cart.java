package br.com.examples.iterator.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * O próprio Java já possui uma interface Iterable, a qual deve ser implementada pelas classes nas quais queremos iterar.
 */
public class Cart implements Iterable<Product> {
	private List<Product> products = new ArrayList<Product>();

	/**
	 * A classe que implementa a interface Iterable deve ter no mínimo o método que retorna um iterator que pode ser
	 * usado pelo cliente. Cada classe Iterable pode ter mais de um iterador, dependendo da complexidade da coleção.
	 * No caso deste exemplo, foi usado o próprio iterator disponível na interface List do Java.
	 */
	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	/**
	 * Construtor que usa varargs, para permitir a inclusão de quantos produtos o cliente quiser.
	 * @param products - Produtos a serem adicionados ao carrinho
	 */
	public Cart(Product... products) {
		this.products = Arrays.asList(products);
	}
}
