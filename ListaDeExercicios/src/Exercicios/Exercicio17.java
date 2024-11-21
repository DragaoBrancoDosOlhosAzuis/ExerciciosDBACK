package Exercicios;

public class Exercicio17 {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }

    public static void main(String[] args) {
        Exercicio17 calculadora = new Exercicio17();
        System.out.println("Soma: " + calculadora.somar(5, 3));
        System.out.println("Subtração: " + calculadora.subtrair(5, 3));
        System.out.println("Multiplicação: " + calculadora.multiplicar(5, 3));
        System.out.println("Divisão: " + calculadora.dividir(5, 3));
    }
}
