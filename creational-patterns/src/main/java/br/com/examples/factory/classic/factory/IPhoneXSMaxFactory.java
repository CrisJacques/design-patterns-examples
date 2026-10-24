package br.com.examples.factory.classic.factory;

import br.com.examples.factory.classic.model.IPhone;
import br.com.examples.factory.classic.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
