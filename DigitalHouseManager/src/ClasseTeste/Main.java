package ClasseTeste;

import ClasseManager.DigitalHouseManager;
import ClasseModelo.Aluno;
import ClasseModelo.Curso;
import ClasseModelo.ProfessorAdjunto;
import ClasseModelo.ProfessorTitular;

public class Main {

    public static void main(String[] args) {

        //CRIANDO A DIGITAL HOUSE MANAGER
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        //CRIANDO PROFESSOR TITULAR
        ProfessorTitular professorTitular1 = new ProfessorTitular(0, "Fábio", "Miyasato", 10001, "Android");
        ProfessorTitular professorTitular2 = new ProfessorTitular(0, "Thiago", "Munhoz", 10002, "Full Stack");
        ProfessorTitular professorTitular3 = new ProfessorTitular(1, "Amyris", "Fernandez", 10003, "UX e UI");

        //ADICIONANDO PROFESSOR TITULAR NA LISTA DE PROFESSORES
        digitalHouseManager.registrarProfessorTitular(professorTitular1);
        digitalHouseManager.registrarProfessorTitular(professorTitular2);
        digitalHouseManager.registrarProfessorTitular(professorTitular3);

        //CRIANDO PROFESSOR ADJUNTO
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto(0, "Guilherme", "Sartori", 11001, 4);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto(0, "Thomaz", "Staziak", 11002, 4);
        ProfessorAdjunto professorAdjunto3 = new ProfessorAdjunto(1, "Ana", "Silva", 11003, 4);

        //ADICIONANDO PROFESSOR ADJUNTO NA LISTA DE PROFESSORES
        digitalHouseManager.registrarProfessorAdjunto(professorAdjunto1);
        digitalHouseManager.registrarProfessorAdjunto(professorAdjunto2);
        digitalHouseManager.registrarProfessorAdjunto(professorAdjunto3);

        //REMOVENDO PROFESSOR DA LISTA DE PROFESSORES
        digitalHouseManager.excluirProfessor(professorTitular3.getIdProfessor());
        digitalHouseManager.excluirProfessor(professorAdjunto3.getIdProfessor());

        //CRIANDO CURSO
        Curso curso1 = new Curso ("Android", 20001, 5);
        Curso curso2 = new Curso ("Full Stack", 20002, 5);
        Curso curso3 = new Curso ("UX", 20003, 5);

        //ADICIONANDO CURSO NA LISTA DE CURSOS
        digitalHouseManager.registrarCurso(curso1);
        digitalHouseManager.registrarCurso(curso2);
        digitalHouseManager.registrarCurso(curso3);

        //REMOVENDO CURSO DA LISTA DE CURSOS
        digitalHouseManager.excluirCurso(curso3.getIdCurso());

        //ALOCANDO PROFESSORES NO CURSO
        digitalHouseManager.alocarProfessores(curso1.getIdCurso(), professorTitular1.getIdProfessor(), professorAdjunto1.getIdProfessor());
        digitalHouseManager.alocarProfessores(curso2.getIdCurso(), professorTitular2.getIdProfessor(), professorAdjunto2.getIdProfessor());

        //CRIANDO ALUNO
        Aluno aluno01 = new Aluno(0, "Ademir", "Assumpção", 30001);
        Aluno aluno02 = new Aluno(1, "Andreza", "Rufino", 30002);
        Aluno aluno03 = new Aluno(1, "Fabiana", "Ota", 30003);
        Aluno aluno04 = new Aluno(0, "Gabriel", "Ponzi", 30004);
        Aluno aluno05 = new Aluno(0, "João", "Ricardi", 30005);
        Aluno aluno06 = new Aluno(1, "Luara", "Ramos", 30006);
        Aluno aluno07 = new Aluno(0, "Lucas", "Prado", 30007);
        Aluno aluno08 = new Aluno(0, "Marcus", "Aulicino", 30008);
        Aluno aluno09 = new Aluno(0, "Raphael", "Bathe", 30009);
        Aluno aluno10 = new Aluno(0, "Rodrigo", "Lima", 30010);
        Aluno aluno11 = new Aluno(0, "Rodrigo", "Tavares", 30011);
        Aluno aluno12 = new Aluno(1, "Tatiana", "Dias", 30012);
        Aluno aluno13 = new Aluno(1, "Thays", "Spolaor", 30013);
        Aluno aluno14 = new Aluno(0, "Thiago", "Gonçalves", 30014);
        Aluno aluno15 = new Aluno(0, "Victor", "Moreno", 30015);

        //ADICIONANDO ALUNO NA LISTA DE ALUNOS
        digitalHouseManager.registrarAluno(aluno01);
        digitalHouseManager.registrarAluno(aluno02);
        digitalHouseManager.registrarAluno(aluno03);
        digitalHouseManager.registrarAluno(aluno04);
        digitalHouseManager.registrarAluno(aluno05);
        digitalHouseManager.registrarAluno(aluno06);
        digitalHouseManager.registrarAluno(aluno07);
        digitalHouseManager.registrarAluno(aluno08);
        digitalHouseManager.registrarAluno(aluno09);
        digitalHouseManager.registrarAluno(aluno10);
        digitalHouseManager.registrarAluno(aluno11);
        digitalHouseManager.registrarAluno(aluno12);
        digitalHouseManager.registrarAluno(aluno13);
        digitalHouseManager.registrarAluno(aluno14);
        digitalHouseManager.registrarAluno(aluno15);

        //REMOVENDO ALUNO EXISTENTE DA LISTA DE ALUNOS
        digitalHouseManager.excluirAluno(aluno15.getIdAluno());

        //REMOVENDO ALUNO NÃO EXISTENTE DA LISTA DE ALUNOS
        digitalHouseManager.excluirAluno(30000);

        //MATRICULANDO ALUNO NOVO NO CURSO COM VAGAS
        digitalHouseManager.matricularAluno(aluno01.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno02.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno03.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno04.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno05.getIdAluno(), curso2.getIdCurso());
        digitalHouseManager.matricularAluno(aluno06.getIdAluno(), curso2.getIdCurso());
        digitalHouseManager.matricularAluno(aluno07.getIdAluno(), curso2.getIdCurso());
        digitalHouseManager.matricularAluno(aluno08.getIdAluno(), curso2.getIdCurso());

        //MATRICULANDO MESMO ALUNO EM CURSOS DIFERENTES
        digitalHouseManager.matricularAluno(aluno09.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno09.getIdAluno(), curso2.getIdCurso());

        //MATRICULANDO ALUNO JÁ MATRICULADO NO CURSO
        digitalHouseManager.matricularAluno(aluno09.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno09.getIdAluno(), curso2.getIdCurso());

        //MATRICULANDO ALUNO NOVO NO CURSO SEM VAGAS
        digitalHouseManager.matricularAluno(aluno10.getIdAluno(), curso1.getIdCurso());
        digitalHouseManager.matricularAluno(aluno11.getIdAluno(), curso2.getIdCurso());

        //MATRICULANDO ALUNO EM CURSO NÃO EXISTENTE
        digitalHouseManager.matricularAluno(aluno12.getIdAluno(), 20000);

        //REMOVENDO ALUNO MATRICULADO DA LISTA DE MATRICULADOS NO CURSO
        digitalHouseManager.buscarCursoPorId(curso1.getIdCurso()).excluirAlunoDoCurso(aluno01);
        digitalHouseManager.buscarCursoPorId(curso2.getIdCurso()).excluirAlunoDoCurso(aluno05);

        //REMOVENDO ALUNO NÃO MATRICULADO DA LISTA DE MATRICULADOS NO CURSO
        digitalHouseManager.buscarCursoPorId(curso1.getIdCurso()).excluirAlunoDoCurso(aluno12);
        digitalHouseManager.buscarCursoPorId(curso2.getIdCurso()).excluirAlunoDoCurso(aluno13);

        //CONSULTANDO CURSO MATRICULADO
        digitalHouseManager.consultarCursoMatriculado(aluno01.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno02.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno03.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno04.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno05.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno06.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno07.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno08.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno09.getIdAluno());
        digitalHouseManager.consultarCursoMatriculado(aluno10.getIdAluno());

    }

}