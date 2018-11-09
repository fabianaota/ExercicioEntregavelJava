package ClasseModelo;

import java.util.Objects;

public class Aluno extends Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idAluno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(idAluno, aluno.idAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno);
    }

    public Aluno(Integer sexo, String nome, String sobrenome, Integer idAluno) {
        super(sexo);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

}