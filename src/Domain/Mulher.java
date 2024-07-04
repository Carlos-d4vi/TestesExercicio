package Domain;

public abstract class Mulher implements IPessoa{

    public Mulher(String nome){
        this.nome = nome;
        this.sexo = "Feminino";
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
