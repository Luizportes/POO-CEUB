public class Empregado extends Pessoa {
    protected String matricula;
    protected String cargo;
    protected double salario;
    protected String departamento;

    public Empregado(String nome, String cpfOuCnpj, String endereco, String telefone, String email,
                     String matricula, String cargo, double salario, String departamento) {
        super(nome, cpfOuCnpj, endereco, telefone, email);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empregado [" + super.toString() +
               ", Matrícula: " + matricula +
               ", Cargo: " + cargo +
               ", Salário: " + salario +
               ", Departamento: " + departamento + "]";
    }
}
