package ClasseManager;

import ClasseModelo.*;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();

    public void registrarCurso(Curso curso) {
        listaCursos.add(curso);
        System.out.println();
        System.out.println("O curso de " + curso.getNome() + " foi criado com sucesso!");
        System.out.println();
    }

    public void excluirCurso(Integer idCurso) {
        for (Curso umCurso : listaCursos) {
            if (umCurso.getIdCurso().equals(idCurso)) {
                listaCursos.remove(umCurso);
                System.out.println();
                System.out.println("O curso de " + umCurso.getNome() + " foi removido do sistema.");
                System.out.println();
                return;
            }
        }
    }

    public void registrarProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        listaProfessores.add(professorAdjunto);
        if (professorAdjunto.getSexo() == 0) {
            System.out.println();
            System.out.println("O professor adjunto " + professorAdjunto.getNome() + " " + professorAdjunto.getSobrenome() + " foi registrado com sucesso!");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("A professora adjunta " + professorAdjunto.getNome() + " " + professorAdjunto.getSobrenome() + " foi registrada com sucesso!");
            System.out.println();
        }

    }

    public void registrarProfessorTitular(ProfessorTitular professorTitular) {
        listaProfessores.add(professorTitular);
        if (professorTitular.getSexo() == 0) {
            System.out.println();
            System.out.println("O professor titular " + professorTitular.getNome() + " " + professorTitular.getSobrenome() + " foi registrado com sucesso!");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("A professora titular " + professorTitular.getNome() + " " + professorTitular.getSobrenome() + " foi registrada com sucesso!");
            System.out.println();
        }
    }

    public void excluirProfessor(Integer idProfessor) {
        for (Professor umProfessor : listaProfessores) {
            if (umProfessor.getIdProfessor().equals(idProfessor)) {
                listaProfessores.remove(umProfessor);
                if (umProfessor.getSexo() == 0) {
                    System.out.println();
                    System.out.println("O professor "+  umProfessor.getNome() + " " + umProfessor.getSobrenome() + " foi removido do sistema.");
                    System.out.println();
                }
                else {
                    System.out.println();
                    System.out.println("A professora "+  umProfessor.getNome() + " " + umProfessor.getSobrenome() + " foi removida do sistema.");
                    System.out.println();
                }
                return;
            }
        }
    }

    public void registrarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        if (aluno.getSexo() == 0) {
            System.out.println();
            System.out.println("O aluno " + aluno.getNome() + " " + aluno.getSobrenome() + " foi registrado com sucesso!");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("A aluna " + aluno.getNome() + " " + aluno.getSobrenome() + " foi registrada com sucesso!");
            System.out.println();
        }
    }

    public void excluirAluno(Integer idAluno) {
        for (Aluno umAluno : listaAlunos) {
            if (umAluno.getIdAluno().equals(idAluno)) {
                listaAlunos.remove(umAluno);
                System.out.println();
                if (umAluno.getSexo() == 0) {
                    System.out.println("O aluno " + umAluno.getNome() + " " + umAluno.getSobrenome() + " foi removido do sistema.");
                    System.out.println();
                }
                else {
                    System.out.println("A aluna " + umAluno.getNome() + " " + umAluno.getSobrenome() + " foi removida do sistema.");
                    System.out.println();
                }
                return;
            }
        }
        System.out.println();
        System.out.println("Não foi possível realizar a operação.");
        System.out.println("Código não consta na lista de alunos do sistema.");
        System.out.println();
    }

    public Aluno buscarAlunoPorId (Integer idAluno) {
        for (Aluno umAluno : listaAlunos) {
            if (umAluno.getIdAluno().equals(idAluno)) {
            return umAluno;
            }
        }
        return null;
    }

    public Curso buscarCursoPorId (Integer idCurso) {
        for (Curso umCurso : listaCursos) {
            if (umCurso.getIdCurso().equals(idCurso)) {
            return umCurso;
            }
        }
        return null;
    }

    public Professor buscarProfessorPorId (Integer idProfessor) {
        for (Professor umProfessor : listaProfessores) {
            if (umProfessor.getIdProfessor().equals(idProfessor)) {
                return umProfessor;
            }
        }
        return null;
    }

    public void matricularAluno(Integer idAluno, Integer idCurso) {
        Matricula matricula = new Matricula();
        Aluno aluno = buscarAlunoPorId(idAluno);
        Curso curso = buscarCursoPorId(idCurso);
        if (curso != null) {
            if (!curso.estaMatriculadoNoCurso(idAluno)) {
                if (curso.podeAdicionarNoCurso(aluno)) {
                    matricula.setAluno(aluno);
                    matricula.setCurso(curso);
                    listaMatriculas.add(matricula);
                    if (aluno.getSexo() == 0) {
                        System.out.println("O aluno " + aluno.getNome() + " " + aluno.getSobrenome() + " foi matriculado no curso de " + curso.getNome() + ".");
                        System.out.println();
                    }
                    else {
                        System.out.println("A aluna " + aluno.getNome() + " " + aluno.getSobrenome() + " foi matriculada no curso de " + curso.getNome() + ".");
                        System.out.println();
                    }
                }
            }
            else {
                System.out.println();
                System.out.println("Não foi possível realizar a operação.");
                if (aluno.getSexo() == 0) {
                    System.out.println("O aluno " + aluno.getNome() + " " + aluno.getSobrenome() + " já está matriculado no curso de " + curso.getNome() + ".");
                    System.out.println();
                }
                else {
                    System.out.println("A aluna " + aluno.getNome() + " " + aluno.getSobrenome() + " já está matriculada no curso de " + curso.getNome() + ".");
                    System.out.println();
                }
            }
        }
        else {
            System.out.println();
            System.out.println("Não foi possível realizar a operação.");
            System.out.println("Código de curso inexistente!");
            System.out.println();
        }
    }

    public void alocarProfessores(Integer idCurso, Integer idProfessorTitular, Integer idProfessorAdjunto) {
        Professor professorAdjunto = buscarProfessorPorId(idProfessorAdjunto);
        Professor professorTitular = buscarProfessorPorId(idProfessorTitular);
        Curso curso = buscarCursoPorId(idCurso);
        curso.setProfessorAdjunto((ProfessorAdjunto) professorAdjunto);
        curso.setProfessorTitular((ProfessorTitular) professorTitular);
        System.out.println();
        System.out.println("Professores do curso " + curso.getNome() + ":");
        System.out.println("Professor generalista: " + professorTitular.getNome() + " " + professorTitular.getSobrenome());
        System.out.println("Professor assistente: " + professorAdjunto.getNome() + " " + professorAdjunto.getSobrenome());
        System.out.println();
    }

    public void consultarCursoMatriculado(Integer idAluno) {
        for (Matricula umaMatricula : listaMatriculas) {
            if (umaMatricula.getAluno().getIdAluno().equals(idAluno)) {
                umaMatricula.getCurso().getNome();
                System.out.println();
                if (umaMatricula.getAluno().getSexo() == 0) {
                    System.out.println("O aluno " + umaMatricula.getAluno().getNome() + " " + umaMatricula.getAluno().getSobrenome() + " está matriculado no curso de:");
                    System.out.println(umaMatricula.getCurso().getNome());
                    System.out.println();
                }
                else {
                    System.out.println("A aluna " + umaMatricula.getAluno().getNome() + " " + umaMatricula.getAluno().getSobrenome() + " está matriculada no curso de:");
                    System.out.println(umaMatricula.getCurso().getNome());
                    System.out.println();
                }
            }
        }
    }

    public DigitalHouseManager() {
    }

}