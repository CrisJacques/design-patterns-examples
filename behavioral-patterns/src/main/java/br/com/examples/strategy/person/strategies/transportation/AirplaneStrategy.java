package br.com.examples.strategy.person.strategies.transportation;

public class AirplaneStrategy implements TransportationStrategy {

	@Override
	public void move() {
		System.out.println("I use an airplane to go (almost) anywhere");
	}

}
