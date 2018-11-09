package ClasseModelo;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Matricula() {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}