package br.com.examples.proxy.remoteResource.services;

public class ResourceImpl implements Resource {
	private String data;

	/**
	 * Construtor que simula o carregamento de recursos pesados, que é demorado. Ajuda a visualizar a diferença entre
	 * usar diretamente esta classe e o Proxy (que traz cache e lazy loading).
	 */
	public ResourceImpl() throws InterruptedException {
		System.out.println("Loading resources from data structure");
		for(int i = 5; i > 0; i--) {
			Thread.sleep(1000);
			System.out.print(".");
		}
		this.data = "This is all your data =)";
		System.out.println("Resource is ready!");
	}

	@Override
	public String getData() {
		return data;
	}

}
