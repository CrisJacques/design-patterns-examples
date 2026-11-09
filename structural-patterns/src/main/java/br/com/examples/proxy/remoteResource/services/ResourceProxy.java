package br.com.examples.proxy.remoteResource.services;

/**
 * Proxy para classes que implementam a interface Resource. Adiciona as seguintes funcionalidades:
 * - Controle de acesso através de validação de token;
 * - Lazy Loading, pois os resources são carregados apenas quando é chamado o método getData(), não no construtor;
 * - Cache, pois é chamada a classe original apenas se a cache estiver vazia, caso contrário retorna os resources
 * diretamente da cache.
 */
public class ResourceProxy implements Resource {
	/**
	 * Cache para os resources
	 */
	private Resource realResource;

	/**
	 * Token para usar no controle de acesso
	 */
	private String validToken = "v@lid!";

	private String tokenProvided;
	
	public ResourceProxy(String tokenProvided) {
		this.tokenProvided = tokenProvided;
	}

	@Override
	public String getData() {
		if(!tokenProvided.equals(validToken)) return "Invalid Token";
		if(realResource == null) {
			try {
				realResource = new ResourceImpl();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return realResource.getData();
	}
}
