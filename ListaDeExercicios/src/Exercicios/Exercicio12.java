package Exercicios;

public class Exercicio12 {
    private String nome;
    private int idade;

    public Exercicio12(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Exercicio12 pessoa = new Exercicio12("Ana", 25);
        pessoa.exibirInformacoes();
    }
}
