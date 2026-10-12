package br.com.examples.chain.process.steps;

import br.com.examples.chain.process.service.ProcessContext;

public class ValidateMandatoryField extends ProcessStep {

	/**
	 * Construtor que recebe uma quantidade genérica de argumentos. Porém, nesta classe
	 * apenas o primeiro argumento informado será efetivamente usado, e deve conter o nome
	 * do campo que deverá ser validado.
	 * @param args - Argumentos (o primeiro deve ser o nome do campo a ser validado).
	 */
	public ValidateMandatoryField(Object... args) {
		super(args);
	}

	/**
	 * Handler que valida se um campo obrigatório foi fornecido. Caso não, retorna uma exceção.
	 * @param context - Dados que serão recebidos e processados pelo handler.
	 * @return O context atualizado.
	 * @throws Exception
	 */
	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object field = context.get((String) args[0]);
		if(field == null) throw new Exception(String.format("%s is empty", args[0]));
		return next(context, true);
	}

}
