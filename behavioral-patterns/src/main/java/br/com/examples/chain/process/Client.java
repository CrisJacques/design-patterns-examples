package br.com.examples.chain.process;

import br.com.examples.chain.process.service.GenericService;
import br.com.examples.chain.process.service.ProcessContext;
import br.com.examples.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		/**
		 * Exemplo 1: Chama o passo saveUserProcess sem informar um campo obrigatório. Neste caso, a cadeia é
		 * interrompida pelo fato de o campo obrigatório name não ter sido informado, retornando uma exceção.
		 */
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);

		/**
		 * Exemplo 2: Limpa o context e chama o passo saveUserProcess informando todos
		 * os campos obrigatórios. Neste caso, a cadeia é executada até o final e o usuário
		 * é salvo no banco de dados.
		 */
		ctx.reset();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
	}
}
