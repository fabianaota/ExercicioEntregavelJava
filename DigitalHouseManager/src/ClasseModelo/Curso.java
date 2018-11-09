package ClasseModelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer idCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer maximoAlunos;
    private List<Aluno> listaMatriculados = new ArrayList<>();

    public Boolean podeAdicionarNoCurso(Aluno umAluno) {
        if (listaMatriculados.size() < maximoAlunos) {
            listaMatriculados.add(umAluno);
            System.out.println();
            System.out.println("Matrícula realizada com sucesso!");
            return true;
        } else {
            System.out.println();
            if (umAluno.getSexo() == 0) {
                System.out.println("Não foi possível matricular o aluno " + umAluno.getNome() + " " + umAluno.getSobrenome() + " no curso de " + getNome() + ".");
                System.out.println("Vaga indisponível no momento.");
                System.out.println();
            } else {
                System.out.println("Não foi possível matricular a aluna " + umAluno.getNome() + " " + umAluno.getSobrenome() + " no curso de " + getNome() + ".");
                System.out.println("Vaga indisponível no momento.");
                System.out.println();
            }
            return false;
        }
    }

    public Boolean estaMatriculadoNoCurso(Integer idAluno) {
        for (Aluno umAluno : listaMatriculados) {
            if (umAluno.getIdAluno().equals(idAluno)) {
                return true;
            }
        }
        return false;
    }

    public void excluirAlunoDoCurso(Aluno umAluno) {
        if (estaMatriculadoNoCurso(umAluno.getIdAluno())) {
            listaMatriculados.remove(umAluno);
            System.out.println();
            if (umAluno.getSexo() == 0) {
                System.out.println("O aluno " + umAluno.getNome() + " " + umAluno.getSobrenome() + " foi excluído do curso de " + getNome() + ".");
                System.out.println();
            }
            else {
                System.out.println("A aluna " + umAluno.getNome() + " " + umAluno.getSobrenome() + " foi excluída do curso de " + getNome() + ".");
                System.out.println();
            }
        } else {
            System.out.println();
            System.out.println("Não foi possível realizar a operação.");
            if (umAluno.getSexo() == 0) {
                System.out.println("O aluno " + umAluno.getNome() + " " + umAluno.getSobrenome() + " não está matriculado no curso de " + getNome() + ".");
                System.out.println();
            }
            System.out.println("A aluna " + umAluno.getNome() + " " + umAluno.getSobrenome() + " não está matriculada no curso de " + getNome() + ".");
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(idCurso, curso.idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }

    public Curso(String nome, Integer idCurso, Integer maximoAlunos) {
        this.nome = nome;
        this.idCurso = idCurso;
        this.maximoAlunos = maximoAlunos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

}