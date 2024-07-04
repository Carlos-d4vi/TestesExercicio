import Domain.IPessoa;
import Domain.Menu;
import Domain.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TesteHomemAdicionadoALista {
    @Test
    public void TestHomemAdicionadaALista(){
        Menu menu = new Menu();

        ArrayList<IPessoa> listaDePessoas = new ArrayList<>();
        /*Verifica se a lista inicia com 0 pessoas*/
        Assert.assertEquals(0, listaDePessoas.size());

        IPessoa pessoa = new Pessoa("PessoaMasculinoTeste", "Masculino");
        menu.adicionarEmUmaLista(pessoa, listaDePessoas);

        /*Verifica se algo foi adicionado a lista.*/
        Assert.assertEquals(1, listaDePessoas.size());
        /*Verifica se a pessoa foi corretamente adicionada.*/
        Assert.assertEquals("PessoaMasculinoTeste", listaDePessoas.get(0).getNome());
        Assert.assertEquals("Masculino", listaDePessoas.get(0).getSexo());
    }
}
