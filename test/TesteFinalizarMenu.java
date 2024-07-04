import Domain.Menu;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TesteFinalizarMenu {
    @Test
    public void TesteFinalizarMenu(){
        Menu menu = new Menu();

        // Simula entrada do usuário para escolher a opção 3 (sair)
        String input = "3\n"; // Opção 3 para sair do menu
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Executa o método que exibe as opções (interação do usuário simulada)
        menu.showOptions();

        // Verifica se o menu finalizou corretamente (listaDePessoas vazia após sair)
        Assert.assertEquals(0, menu.listaDePessoas.size());
    }
}
