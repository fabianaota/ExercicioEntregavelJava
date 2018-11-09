package ClasseModelo;

public abstract class Pessoa {

    private Integer sexo;

    public Pessoa(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

}
