package br.com.examples.abstractfactory.app.service.services;

/**
 * Os produtos criados pelas Abstract Factories (neste caso, os Services) precisam implementar uma interface, para que
 * o cliente funcione com quaisquer objetos que implementem essa mesma interface.
 */
public interface CarService {
	void save(String model);
	void update(String newModel);
}
