package Exercicios;

public class Exercicio15 {
    private double saldo;
    private String numero;

    public Exercicio15(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public static void main(String[] args) {
        Exercicio15 conta = new Exercicio15("12345-6");
        conta.depositar(100.0);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
