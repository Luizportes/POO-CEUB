public class Professor {
    private String nome;
    private String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno cadastrarAluno(String nomeAluno, Turma turma) {
        Aluno aluno = new Aluno(nomeAluno, turma);
        turma.adicionarAluno(aluno);
        return aluno;
    }

    public Atividade cadastrarAtividade(String titulo, String descricao, Turma turma) {
        return new Atividade(titulo, descricao, turma, null);
    }

    public Atividade cadastrarAtividadeIndividual(String titulo, String descricao, Aluno aluno) {
        return new Atividade(titulo, descricao, null, aluno);
    }

    public Nota lancarNota(Aluno aluno, Atividade atividade, double valor) {
        Nota nota = new Nota(valor, atividade, aluno);
        aluno.receberNota(nota);
        return nota;
    }
}
