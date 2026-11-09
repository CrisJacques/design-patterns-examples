package br.com.examples.proxy.bank.services;

/**
 * Classe que representa o Caixa Eletrônico, que é um Proxy para o Banco (assim como funciona na vida real).
 */
public class ATM implements BankOperations {
	/**
	 * O atributo bank pode ser qualquer objeto que implemente a interface BankOperations. Dessa forma, a classe ATM
	 * não fica diretamente acoplada à classe Bank.
	 */
	private BankOperations bank;
	
	public ATM(BankOperations bank) {
		this.bank = bank;
	}

	/**
	 * Depósitos via ATM estão sujeitos às mesmas regras de um depósito feito na agência bancária, então nesse caso a
	 * chamada é simplesmente repassada.
	 */
	@Override
	public void deposit(Long account, Long amount) {
		System.out.println("ATM proxy sending request to bank");
		bank.deposit(account, amount);
	}

	/**
	 * Saques só podem ser feitos via ATM se o valor for abaixo de 300 reais. Acima desse valor, a chamada não é
	 * repassada.
	 */
	@Override
	public void withdraw(Long account, String passwd, Long amount) {
		if(amount > 300) {
			System.out.println("You may not withdraw amounts over 300 here");
			return;
		}
		System.out.println("ATM proxy sending request to bank");
		bank.withdraw(account, passwd, amount);
	}

	/**
	 * Mudança de senha da conta bancária só pode ser feita na agência, então essa operação não é liberada via ATM em
	 * nenhuma hipótese.
	 */
	@Override
	public void changePassword(Long account, String oldPassword, String newPassword) {
		System.out.println("You must go to the bank to perform this operation");
		return;
	}

}
