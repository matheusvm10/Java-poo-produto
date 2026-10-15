public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }

    public void reajustarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome + " | Cargo: " + cargo + " | Salário: R$ " + salario);
    }
}
