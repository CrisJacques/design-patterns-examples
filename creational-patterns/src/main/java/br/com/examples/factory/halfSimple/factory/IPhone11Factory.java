package br.com.examples.factory.halfSimple.factory;

import br.com.examples.factory.halfSimple.model.IPhone;
import br.com.examples.factory.halfSimple.model.IPhone11;
import br.com.examples.factory.halfSimple.model.IPhone11Pro;

/**
 * Ao contrário do exemplo 1, onde cada Factory retornava apenas um tipo de produto, esta Factory retorna diferentes
 * modelos de iPhone da mesma geração.
 */
public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11();
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro();
		} else return null;
	}

}
