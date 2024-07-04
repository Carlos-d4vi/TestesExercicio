package Domain;

public class Pessoa implements IPessoa{

    public Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    String nome;
    String sexo;

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
