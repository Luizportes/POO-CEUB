public class Atividade {
    private String titulo;
    private String descricao;
    private Turma turma;
    private Aluno aluno;

    public Atividade(String titulo, String descricao, Turma turma, Aluno aluno) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.turma = turma;
        this.aluno = aluno;

        if (turma != null) {
            for (Aluno a : turma.getAlunos()) {
                a.receberAtividade(this);
            }
        } else if (aluno != null) {
            aluno.receberAtividade(this);
        }
    }

    // Getters e Setters opcionais
}
