package br.com.examples.iterator.cart;

/**
 * Classe simples com os atributos de um produto. Os atributos foram definidos como final, pois não serão modificados.
 */
public class Product {
	private final String desc;
	private final Double value;

	public Product(String desc, Double value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}
	
	public Double getValue() {
		return value;
	}
}
