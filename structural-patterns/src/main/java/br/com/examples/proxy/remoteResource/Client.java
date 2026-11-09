package br.com.examples.proxy.remoteResource;

import br.com.examples.proxy.remoteResource.services.Resource;
import br.com.examples.proxy.remoteResource.services.ResourceImpl;
import br.com.examples.proxy.remoteResource.services.ResourceProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Client {

	/**
	 * Cria um terminal interativo com o usuário, permitindo a seleção de algumas opções, dentre elas o carregamento
	 * de recursos. O comportamento varia se o cliente utilizar diretamente a classe ResourceImpl ou o seu Proxy:
	 * - ResourceImpl não possui controle de acesso nem lazy loading: todas as chamadas são aceitas, e os recursos são
	 * carregados antes mesmo de serem realmente necessários.
	 * - ResourceProxy possui controle de acesso (somente são aceitas chamadas com token válido), lazy loading (recursos
	 * são carregados somente quando necessário) e cache (a chamada apenas é redirecionada ao ResourceImpl quando a
	 * cache estiver vazia, caso contrário retorna os recursos da cache).
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		/**
		 * Remova o comentário de apenas uma das 3 linhas abaixo. Cada uma delas exercita um caso de uso diferente:
		 * Resource resource = new ResourceProxy("v@lid!"); - aciona o Proxy com um token válido
		 * Resource resource = new ResourceProxy("Inv@lid!"); - aciona o Proxy com um token inválido
		 * Resource resource = new ResourceImpl(); - não utiliza o Proxy para carregamento dos recursos
		 */
		Resource resource = new ResourceProxy("v@lid!");
//		Resource resource = new ResourceProxy("Inv@lid!");
//		Resource resource = new ResourceImpl();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		boolean exit = false;
		while(true) {
			System.out.print("This is your options?:\n"
					+ "\t1-Current date\n"
					+ "\t...Other Options\n"
					+ "\t9-Get Resource's data\n"
					+ "\t0-Exit\n"
					+ "What do you want? ");
			String option = buffer.readLine();
			System.out.println("\n\n");
			switch (option) {
				case "1": System.out.println(new Date()); break;
				case "9": System.out.println(resource.getData()); break;
				case "0": exit = true; break;
				default: System.out.println("Processing other options"); break;
			}
			System.out.println("\n\n");
			if(exit) break;
		}
		System.out.println("Bye!");
	}
}
