package Exercicios;

enum NivelPrioridade {
    BAIXO(1),
    MEDIO(2),
    ALTO(3),
    URGENTE(4);

    private int codigo;

    NivelPrioridade(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirDetalhes() {
        System.out.println("Nível: " + this.name() + " - Código: " + codigo);
    }
}

public class Exercicio18 {
    public static void main(String[] args) {
        for (NivelPrioridade prioridade : NivelPrioridade.values()) {
            prioridade.exibirDetalhes();
        }
    }
}
