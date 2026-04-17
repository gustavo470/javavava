package app;

import model.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        // 1. Criar conta do cliente João
        ContaBancaria c1 = new ContaBancaria("João", "Corrente", 1000.00);

        // 2. Imprimir dados
        System.out.println(c1);

        // 3. Depositar 500
        c1.depositar(500.00);
        System.out.println("Após depósito de 500: " + c1.getSaldo());

        // 4. Tentar depósito inválido
        c1.depositar(-100.00);

        // 5. Sacar 200
        c1.sacar(200.00);
        System.out.println("Após saque de 200: " + c1.getSaldo());

        // 6. Tentar saque inválido
        c1.sacar(5000.00);

    }
}
