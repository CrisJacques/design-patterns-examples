package br.com.examples.factory.classic.factory;

import br.com.examples.factory.classic.model.IPhone;
import br.com.examples.factory.classic.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
