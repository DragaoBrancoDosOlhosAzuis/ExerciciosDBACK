package Exercicios;

public class Exercicio19 {
    public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double total = precoBase * quantidade;
        return total - (total * descontoPercentual / 100);
    }

    public static void main(String[] args) {
        Exercicio19 loja = new Exercicio19();
        System.out.println("Preço sem desconto: " + loja.calcularPreco(50.0, 3));
        System.out.println("Preço com desconto: " + loja.calcularPreco(50.0, 3, 10.0));
    }
}
