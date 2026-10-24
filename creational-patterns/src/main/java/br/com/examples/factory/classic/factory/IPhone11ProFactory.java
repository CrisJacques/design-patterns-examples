package br.com.examples.factory.classic.factory;

import br.com.examples.factory.classic.model.IPhone;
import br.com.examples.factory.classic.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
