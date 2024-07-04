import Domain.IPessoa;
import Domain.MulherConcreta;
import Domain.Pessoa;
import org.junit.Test;

import java.util.ArrayList;

public class TesteFiltragemDeMulheresOpcao2 {
    @Test
    public void TesteFiltragemDeMulheresOpcao2(){

        ArrayList<IPessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("João", "Masculino"));
        listaDePessoas.add(new MulherConcreta("Maria"));
        listaDePessoas.add(new Pessoa("Pedro", "Masculino"));
        listaDePessoas.add(new MulherConcreta("Ana"));

    }
}
