package Domain;

public class MulherConcreta extends Mulher{
    public MulherConcreta(String nome){
        super(nome);
    }

    public String showMulherInfo(){
        return "Nome: " + nome + "\nSexo: " + sexo;
    }
}
