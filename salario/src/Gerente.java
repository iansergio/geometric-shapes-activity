class Gerente extends Funcionario{
    public Gerente (String nome, double salarioHora,double horasTrabalhadas) {
        super(nome, salarioHora, horasTrabalhadas);
    }
    @Override
    public double calcSalario(){
        return super.calcSalario() * 1.05;
    }
}
