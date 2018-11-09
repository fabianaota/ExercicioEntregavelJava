package ClasseModelo;

public class ProfessorAdjunto extends Professor {

    private Integer horasMonitoria;

    public ProfessorAdjunto(Integer sexo, String nome, String sobrenome, Integer idProfessor, Integer horasMonitoria) {
        super(sexo, nome, sobrenome, idProfessor);
        this.horasMonitoria = horasMonitoria;
    }

}