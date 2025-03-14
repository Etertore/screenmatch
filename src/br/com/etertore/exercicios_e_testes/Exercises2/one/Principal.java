package br.com.etertore.exercicios_e_testes.Exercises2.one;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123456);
        conta.setSaldo(5000);
        conta.titular = "Dem";

        System.out.println("Número da conta " + conta.getNumeroConta());
        System.out.println("Saldo " + conta.getSaldo());
        System.out.println("Titular " + conta.titular);

        conta.setSaldo(10000);
        System.out.println("Novo Saldo " + conta.getSaldo());
    }
}
