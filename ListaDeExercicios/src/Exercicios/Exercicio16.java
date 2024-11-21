package Exercicios;

class Processador {
    private String modelo;
    private double velocidade;

    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getDetalhes() {
        return "Processador: " + modelo + " - " + velocidade + "GHz";
    }
}

class Memoria {
    private int capacidade;

    public Memoria(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDetalhes() {
        return "Memória: " + capacidade + "GB";
    }
}

public class Exercicio16 {
    private Processador processador;
    private Memoria memoria;

    public Exercicio16(Processador processador, Memoria memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    public void exibirDetalhes() {
        System.out.println(processador.getDetalhes());
        System.out.println(memoria.getDetalhes());
    }

    public static void main(String[] args) {
        Processador processador = new Processador("Intel i7", 3.5);
        Memoria memoria = new Memoria(16);
        Exercicio16 computador = new Exercicio16(processador, memoria);
        computador.exibirDetalhes();
    }
}
