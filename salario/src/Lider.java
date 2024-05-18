class Lider extends Funcionario {
    public Lider (String nome, double salarioHora,double horasTrabalhadas) {
        super(nome, salarioHora, horasTrabalhadas);
    }
    @Override
    public double calcSalario(){
        return super.calcSalario() * 1.02;
    }

}
