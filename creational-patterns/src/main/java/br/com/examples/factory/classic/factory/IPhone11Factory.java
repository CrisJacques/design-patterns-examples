package br.com.examples.factory.classic.factory;

import br.com.examples.factory.classic.model.IPhone;
import br.com.examples.factory.classic.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
