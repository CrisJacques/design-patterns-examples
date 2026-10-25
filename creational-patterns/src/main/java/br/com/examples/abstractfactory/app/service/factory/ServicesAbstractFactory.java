package br.com.examples.abstractfactory.app.service.factory;

import br.com.examples.abstractfactory.app.service.services.CarService;
import br.com.examples.abstractfactory.app.service.services.UserService;

/**
 * Os métodos fazem referência às interfaces UserService e CarService, para que o código cliente seja compatível com
 * quaisquer classes concretas que implementem essas interfaces.
 */
public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
