package br.com.examples.chain.process.service;

import br.com.examples.chain.process.steps.ProcessStep;
import br.com.examples.chain.process.steps.SaveUser;
import br.com.examples.chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {

	/**
	 * Constrói a cadeia de handlers responsável pelo passo de salvar o usuário no banco.
	 * Observe que 3 dos handlers são do mesmo tipo e o último handler é de tipo diferente.
	 */
	public static ProcessStep saveUserProcess = buildChain(
			new ValidateMandatoryField("name"),
			new ValidateMandatoryField("email"),
			new ValidateMandatoryField("password"),
			new SaveUser());

	/**
	 * Constrói uma cadeia customizada, levando em conta a ordem de declaração dos steps.
	 * @param steps - Passos que irão compor a cadeia, já na ordem de execução.
	 * @return O primeiro elemento da cadeia (que conterá referência para o segundo e
	 * assim por diante).
	 */
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
