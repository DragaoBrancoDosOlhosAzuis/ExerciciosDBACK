package Exercicios;

class Funcionario {
    private double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salarioBase, double bonus) {
        super(salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}

public class Exercicio20 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3000.0);
        Gerente gerente = new Gerente(3000.0, 1500.0);

        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario());
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
    }
}
