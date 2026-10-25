package br.com.examples.abstractfactory.app.service.factory;

import br.com.examples.abstractfactory.app.service.services.CarRestApiService;
import br.com.examples.abstractfactory.app.service.services.CarService;
import br.com.examples.abstractfactory.app.service.services.UserRestApiService;
import br.com.examples.abstractfactory.app.service.services.UserService;

/**
 * Os métodos fazem referência às interfaces UserService e CarService, para que o código cliente seja compatível com
 * quaisquer classes concretas que implementem essas interfaces.
 */
public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
