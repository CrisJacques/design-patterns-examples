package br.com.examples.iterator.tvChannel;

import java.util.Iterator;
import java.util.Random;

public class TV implements Iterable<Integer> {
	/**
	 * Como teremos um iterador para os canais da TV, a lista de canais pode ser mantida privada por conveniência e
	 * segurança.
	 */
	private Integer[] channels;

	public TV() {
		searchAvailableChannels();
	}
	
	private void searchAvailableChannels() {
		this.channels = new Integer[30];
		Random r = new Random();
		int channelsCount = 0;
		for(int i = 0; i < channels.length; i++) {
			if(r.nextInt(2) == 1) {
				channels[channelsCount++] = i;
			}
		}
		System.out.println(String.format("Found %d channels...", channelsCount));
	}

	/**
	 * Iterador disponibilizado pela classe TV aos clientes
	 * @return Uma instância de ChannerIterator, que é um Iterador customizado
	 */
	public Iterator<Integer> iterator() {
		return new ChannelIterator(channels);
	}
}
