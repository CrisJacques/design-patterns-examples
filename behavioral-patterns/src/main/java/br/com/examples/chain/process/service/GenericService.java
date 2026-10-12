package br.com.examples.chain.process.service;

import br.com.examples.chain.process.steps.ProcessStep;

public class GenericService {

	/**
	 * Executa a cadeia e retorna o resultado (que será do último handler executado)
	 * @param startProcess - Primeiro handler da cadeia
	 * @param initialContext - ProcessContext inicial
	 * @return Resultado do processamento da cadeia
	 */
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
