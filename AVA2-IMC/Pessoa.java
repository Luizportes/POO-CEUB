
public class Pessoa {
    
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
    }
   
    private static double calcularImcPessoa(double peso, double altura) {
        double imc = 0.0;
        
        imc = peso / ( Math.pow(altura, 2) );
        return imc;
    }
   
    public void mostrarImcPessoa(){
        System.out.println("Nome:" + this.nomePessoa);
        System.out.println("Peso:" + this.pesoPessoa);
        System.out.println("Altura:" + this.alturaPessoa);
        System.out.println("IMC:" + this.imcPessoa);
        String classificacao = ClassificacaoImc.classificar(this.imcPessoa);
        System.out.println("Classificação do IMC:" + classificacao);
    }
}
    
