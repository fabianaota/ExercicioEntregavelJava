package ClasseModelo;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(Integer sexo, String nome, String sobrenome, Integer idProfessor, String especialidade) {
        super(sexo, nome, sobrenome, idProfessor);
        this.especialidade = especialidade;
    }

}