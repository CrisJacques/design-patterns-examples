package br.com.examples.facade.callCenter.withDomain.services;

import br.com.examples.facade.callCenter.withDomain.model.Card;
import br.com.examples.facade.callCenter.withDomain.model.Register;

import java.util.List;

/**
 * Classe de serviços relativos a pagamentos.
 * Tem visibilidade apenas de pacote para poder ser acessada apenas pela Facade
 * e classes do pacote e não pelos clientes.
 */
class PaymentService {
	private RegisterService registerService;
	
	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream()
				.reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		System.out.println(String.format("You have to pay %.2f until next week", sum));
	}

}
