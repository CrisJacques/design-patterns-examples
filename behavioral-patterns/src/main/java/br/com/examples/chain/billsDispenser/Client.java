package br.com.examples.chain.billsDispenser;

public class Client {
    public static void main(String[] args) {
        /**
         * Exemplo 1: Usando a cadeia de handlers padrão construída dentro da classe Dispenser
         */
        Dispenser dispenser = new Dispenser();
        System.out.println("Withdrawing $230...");
        dispenser.withDraw(230);
        System.out.println("Withdrawing $1589...");
        dispenser.withDraw(1589);

        /**
         * Exemplo 2: Criando uma cadeia de handlers customizada. Note que é possível criar cadeias de tamanhos e
         * configurações diversas, sem precisar mexer nem na classe Dispenser (que cria as cadeias) e nem na classe
         * Bill (que constrói os handlers).
         */
        Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128), new Bill(64)
                , new Bill(32), new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
        System.out.println("Withdrawing $230...");
        customDispenser.withDraw(230);
        System.out.println("Withdrawing $1589...");
        customDispenser.withDraw(1589);
    }
}
