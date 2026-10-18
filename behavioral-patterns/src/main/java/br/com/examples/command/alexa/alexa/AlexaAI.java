package br.com.examples.command.alexa.alexa;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {
	private Map<String, String[]> associations;
	
	public AlexaAI() {
		associations = new HashMap<String, String[]>();
	}
	
	public void addAssociation(String key, String[] association) {
		associations.put(key, association);
	}

	/**
	 * Verifica se há um conjunto de palavras em que todas estejam presentes da request feita pelo usuário
	 * @param request - Request feita pelo usuário
	 * @return key para o comando desejado (correspondente ao conjunto de palavras, caso uma correspondência
	 * seja encontrada)
	 */
	public String getFindAssociations(String request) {
		for(String[] association: associations.values()) {
			if (Stream.of(association).allMatch(request::contains)) {
				return getKeyFromAssociations(association);
			}
		}
		return null;
	}

	/**
	 * Retorna a key do comando correspondente ao conjunto de palavras informado
	 * @param keywords - Conjunto de palavras
	 * @return key correspondente ao comando que deve ser executado
	 */
	private String getKeyFromAssociations(String... keywords) {
		return associations
			      .entrySet()
			      .stream()
			      .filter(entry -> keywords.equals(entry.getValue()))
			      .map(Map.Entry::getKey)
			      .findFirst().get();
	}
}
