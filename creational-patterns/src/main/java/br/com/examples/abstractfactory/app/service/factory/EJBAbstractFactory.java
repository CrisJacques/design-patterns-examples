package br.com.examples.abstractfactory.app.service.factory;

import br.com.examples.abstractfactory.app.service.services.CarEJBService;
import br.com.examples.abstractfactory.app.service.services.CarService;
import br.com.examples.abstractfactory.app.service.services.UserEJBService;
import br.com.examples.abstractfactory.app.service.services.UserService;

/**
 * Os métodos fazem referência às interfaces UserService e CarService, para que o código cliente seja compatível com
 * quaisquer classes concretas que implementem essas interfaces.
 */
public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



