public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private int matricula;
    private float salario;
    private String dataContratacao;
    private float salarioBase;
    private float horasTrabalhadas;

    private static int geraMatricula = 0;

    public Funcionario(String nome, float salarioBase, float horasTrabalhadas, String dataContratacao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = dataContratacao;

        geraMatricula++;
        this.matricula = geraMatricula;

        this.calculaSalario();
    }

    public void calculaSalario() {
        Calculo calc = new Calculo();
        calc.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calc.getTotalSalario();
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Data de Contratação: " + this.dataContratacao);
        System.out.println("Salário Base: " + this.salarioBase);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Salário Total: " + this.salario);
    }


}