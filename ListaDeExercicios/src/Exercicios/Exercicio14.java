package Exercicios;

interface Veiculo {
    void mover();
}

class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}

class Bicicleta implements Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo.");
    }
}

public class Exercicio14 {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}
