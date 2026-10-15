package br.com.examples.facade.callCenter.withDomain.services;

import br.com.examples.facade.callCenter.withDomain.model.Card;
import br.com.examples.facade.callCenter.withDomain.model.Register;

import java.util.List;

/**
 * Classe de serviços relativos a relatórios.
 * Tem visibilidade apenas de pacote para poder ser acessada apenas pela Facade
 * e classes do pacote e não pelos clientes.
 */
class ReportService {
	private RegisterService registerService;
	
	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSumary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for(Register reg: registers) {
			System.out.println(String.format("%s\t%.2f\t%s", 
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()
					));
		}
	}

}
