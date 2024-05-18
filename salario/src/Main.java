public  class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario: ", 10.0, 130.0);
        Lider lider = new Lider("Líder: ", 10.0, 130.0);
        Gerente gerente = new Gerente("Gerente: ", 10.0, 130.0);

        System.out.println("Salário do Funcionário: " + funcionario.calcSalario());
        System.out.println("Salário do Líder: " + lider.calcSalario());
        System.out.println("Salário do Gerente: " + gerente.calcSalario());
    }
}