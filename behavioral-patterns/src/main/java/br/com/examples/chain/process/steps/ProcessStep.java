package br.com.examples.chain.process.steps;

import br.com.examples.chain.process.service.ProcessContext;

public abstract class ProcessStep {
	protected ProcessStep nextStep;
	protected Object[] args;
	
	public ProcessStep(Object... args) {
		this.args = args;
	}

	/**
	 * Método que conterá a lógica de processamento de cada handler.
	 * @param context - Dados que serão recebidos e processados pelo handler.
	 * @return O context atualizado pelo próprio handler.
	 * @throws Exception
	 */
	public abstract ProcessContext execute(ProcessContext context) throws Exception;
	
	public void setNextStep(ProcessStep next) {
		this.nextStep = next;
	}

	/**
	 * Chama o próximo handler da cadeia, se for o caso.
	 * @param context - ProcessContext a ser passado para o próximo handler (é o context atual).
	 * @param actualResult - Resultado do processamento do handler atual.
	 * @return ProcessContext atualizado pelo próximo handler ou pelo próprio handler, caso ele seja
	 * o último da cadeia.
	 * @throws Exception
	 */
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.addProcessResult(actualResult);
		return this.nextStep != null? nextStep.execute(context): context;
	}
 }
