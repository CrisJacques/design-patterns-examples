package br.com.examples.factory.halfSimple.factory;

import br.com.examples.factory.halfSimple.model.IPhone;
import br.com.examples.factory.halfSimple.model.IPhoneX;
import br.com.examples.factory.halfSimple.model.IPhoneXSMax;

/**
 * Ao contrário do exemplo 1, onde cada Factory retornava apenas um tipo de produto, esta Factory retorna diferentes
 * modelos de iPhone da mesma geração.
 */
public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
