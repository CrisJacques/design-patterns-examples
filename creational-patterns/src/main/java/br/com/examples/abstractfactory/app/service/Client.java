package br.com.examples.abstractfactory.app.service;

import br.com.examples.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.examples.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.examples.abstractfactory.app.service.services.CarService;
import br.com.examples.abstractfactory.app.service.services.UserService;

/**
 * A classe cliente interage apenas com as interfaces das Abstract Factories e dos produtos que elas produzem (no caso
 * desse exemplo, os Services). Com isso, caso se deseje trocar a tecnologia dos serviços a serem utilizados (de Rest
 * para EJB ou qualquer outra), basta alterar uma única linha de código! Ver linhas 16 e 17.
 */
public class Client {

	public static void main(String[] args) {
//		ServicesAbstractFactory factory = new EJBAbstractFactory();
		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
