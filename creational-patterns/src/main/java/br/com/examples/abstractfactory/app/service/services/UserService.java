package br.com.examples.abstractfactory.app.service.services;

/**
 * Os produtos criados pelas Abstract Factories (neste caso, os Services) precisam implementar uma interface, para que
 * o cliente funcione com quaisquer objetos que implementem essa mesma interface.
 */
public interface UserService {
	void save(String name);
	boolean delete(Integer id);
}
