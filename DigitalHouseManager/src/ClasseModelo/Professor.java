package ClasseModelo;

import java.util.Objects;

public abstract class Professor extends Pessoa {

    private String nome;
    private String sobrenome;
    private Integer tempoCasa = 0;
    private Integer idProfessor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(idProfessor, professor.idProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfessor);
    }

    public Professor(Integer sexo, String nome, String sobrenome, Integer idProfessor) {
        super(sexo);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idProfessor = idProfessor;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public String getNome() {
        return nome;
    }

}