package br.com.examples.abstractfactory.apple.factory.abstractFactory;

import br.com.examples.abstractfactory.apple.model.certificate.Certificate;
import br.com.examples.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
