import Domain.IPessoa;
import Domain.Menu;
import Domain.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TesteMulherAdicionadaALista {
    @Test
    public void TestMulherAdicionadaALista(){
        Menu menu = new Menu();

        ArrayList<IPessoa> listaDePessoas = menu.listaDePessoas;
        /*Verifica se a lista inicia com 0 pessoas*/
        Assert.assertEquals(0, listaDePessoas.size());

        IPessoa pessoa = new Pessoa("PessoaFemininoTeste", "Feminino");
        menu.adicionarEmUmaLista(pessoa, listaDePessoas);

        /*Verifica se algo foi adicionado a lista.*/
        Assert.assertEquals(1, listaDePessoas.size());
        /*Verifica se a pessoa foi corretamente adicionada.*/
        Assert.assertEquals("PessoaFemininoTeste", listaDePessoas.get(0).getNome());
        Assert.assertEquals("Feminino", listaDePessoas.get(0).getSexo());
    }
}
