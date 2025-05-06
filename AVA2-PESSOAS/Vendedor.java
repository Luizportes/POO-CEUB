public class Vendedor extends Empregado {
    private double comissao;
    private double metaVendas;

    public Vendedor(String nome, String cpfOuCnpj, String endereco, String telefone, String email,
                    String matricula, String cargo, double salario, String departamento,
                    double comissao, double metaVendas) {
        super(nome, cpfOuCnpj, endereco, telefone, email, matricula, cargo, salario, departamento);
        this.comissao = comissao;
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Vendedor [" + super.toString() +
               ", Comissão: " + comissao +
               ", Meta de Vendas: " + metaVendas + "]";
    }
}
