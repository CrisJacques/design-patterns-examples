package br.com.examples.facade.callCenter.withDomain;

import br.com.examples.facade.callCenter.withDomain.services.CallCenterFacade;
import br.com.examples.facade.callCenter.withDomain.model.Card;

/**
 * O uso do Facade torna o código do cliente muito mais enxuto e limpo, pois
 * toda a complexidade fica escondida por detrás da fachada (literalmente).
 */
public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		System.out.println(card);
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
