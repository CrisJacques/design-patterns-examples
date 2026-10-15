package br.com.examples.facade.callCenter.isolated;

import br.com.examples.facade.callCenter.isolated.facade.CallCenterFacade;
import br.com.examples.facade.callCenter.isolated.facade.CallCenterNewCardFacade;

/**
 * Classe cliente depende apenas das Facades, já que seus métodos recebem e retornam apenas
 * tipos primitivos e Strings.
 */
public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		CallCenterNewCardFacade newFacade = new CallCenterNewCardFacade();
		Long userNumber = 123456L;
		
		Long cardNumber = facade.getCardByUser(userNumber);
		System.out.println(cardNumber);
		
		facade.getSumary(cardNumber);
		
		facade.getPaymentInfoByCard(cardNumber);
		
		newFacade.cancelLastRegister(userNumber);
		
		Long newCardNumber = facade.getCardByUser(userNumber);
		System.out.println(newCardNumber);
		
		newFacade.orderNewCard(userNumber);
		Long newNewCardNumber = facade.getCardByUser(userNumber);
		System.out.println(newNewCardNumber);
	}
}
