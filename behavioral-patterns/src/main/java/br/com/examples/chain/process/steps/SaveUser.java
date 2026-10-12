package br.com.examples.chain.process.steps;

import br.com.examples.chain.process.repository.UserRepository;
import br.com.examples.chain.process.service.ProcessContext;

import java.util.HashMap;
import java.util.Map;

public class SaveUser extends ProcessStep {
	
	public SaveUser(Object... args) {
		super(args);
	}

	/**
	 * Handler que salva o usuário no banco de dados
	 * @param context - Dados que serão recebidos e processados pelo handler.
	 * @return O context atualizado
	 * @throws Exception
	 */
	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Map<String, Object> userInput = new HashMap<String, Object>();
		userInput.put("name", context.get("name"));
		userInput.put("email", context.get("email"));
		userInput.put("password", context.get("password"));
		UserRepository.getInstance().saveUser(userInput);
		return next(context, String.format("User '%s' saved!", userInput.get("name")));
	}

}
