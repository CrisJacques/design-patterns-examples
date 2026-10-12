package br.com.examples.iterator.tvChannel;

public class Client {

	/**
	 * Instancia uma TV e navega pelos canais através de um for each, sem precisar conhecer detalhes da coleção
	 * (inclusive a coleção não está acessível diretamente para o cliente).
	 */
	public static void main(String[] args) {
		TV tv = new TV();
		for(Integer channel: tv) {
			System.out.println(String.format("Zapping at channel #%d", channel));
		}
	}
}
