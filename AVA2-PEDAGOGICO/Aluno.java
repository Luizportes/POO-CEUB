import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Turma turma;
    private List<Atividade> atividades = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();

    public Aluno(String nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public void receberAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void receberNota(Nota nota) {
        notas.add(nota);
    }

    // Getters e Setters opcionais
}
