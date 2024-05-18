public class Funcionario {
    private String nome;
    private double salarioHora;
    private double horasTrabalhadas;

    public Funcionario(String nome, double salarioHora, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcSalario() {
        return salarioHora * horasTrabalhadas;
    }
}
