package br.com.examples.proxy.bank;

import br.com.examples.proxy.bank.services.ATM;
import br.com.examples.proxy.bank.services.Bank;
import br.com.examples.proxy.bank.services.BankOperations;

public class Client {

	/**
	 * Aqui é feita a comparação entre chamadas feitas diretamente ao banco e chamadas feitas ao ATM (proxy do banco).
	 * Enquanto no banco todas as operações foram autorizadas, as chamadas feitas via ATM só foram autorizadas em casos
	 * permitidos pelas regras de negócio (ver classe ATM).
	 */
	public static void main(String[] args) {
		BankOperations bank = new Bank();
		bank.deposit(123L, 500L);
		bank.withdraw(456L, "8888", 50L);
		bank.withdraw(456L, "9999", 50L);
		bank.withdraw(123L, "1234", 2000L);
		bank.changePassword(123L, "1111", "4321");
		bank.changePassword(123L, "1234", "4321");
		bank.withdraw(123L, "4321", 700L);
		
		System.out.println("------------- ATM -------------");
		BankOperations atm = new ATM(bank);
		atm.deposit(123L, 500L);
		atm.withdraw(456L, "8888", 50L);
		atm.withdraw(456L, "9999", 50L);
		atm.withdraw(123L, "1234", 2000L);
		atm.changePassword(123L, "1111", "4321");
		atm.changePassword(123L, "1234", "4321");
		atm.withdraw(123L, "4321", 700L);
	}
}
