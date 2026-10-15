package br.com.examples.facade.callCenter.withDomain.services;

import br.com.examples.facade.callCenter.withDomain.model.Card;
import br.com.examples.facade.callCenter.withDomain.model.Register;

import java.util.List;

/**
 * Classe de serviços relativos a segurança.
 * Tem visibilidade apenas de pacote para poder ser acessada apenas pela Facade
 * e classes do pacote e não pelos clientes.
 */
class SecurityService {
	private CardService cardService;
	private RegisterService registerService;
	
	public SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	public List<Register> blockCard(Card card) {
		System.out.println("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
