package br.com.examples.iterator.tvChannel;

import java.util.Iterator;

/**
 * Iterador customizado que implementa a interface Iterator do Java
 */
public class ChannelIterator implements Iterator<Integer> {
	/**
	 * Lista de canais, mantida privada por conveniência e segurança. Além disso, não é necessário expor porque temos
	 * os métodos hasNext() e next(), que irão ser usados para percorrer a lista de canais.
	 */
	private Integer[] channels;
	private int index;
	
	public ChannelIterator(Integer[] channels) {
		this.channels = channels;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (channels == null) return false;
		return channels[index] != null;
	}

	/**
	 * Retorna o próximo canal da lista: channels[index++] acessa primeiro o elemento usando o valor atual de index e
	 * depois incrementa a variável.
	 * @return O próximo canal a ser exibido.
	 */
	@Override
	public Integer next() {
		return channels[index++];
	}
}
