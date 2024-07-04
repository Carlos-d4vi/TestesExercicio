package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Menu {
    ArrayList<IPessoa> listaDePessoas = new ArrayList<>();
    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        String resposta;

       do {
           System.out.println("(1) - Adicionar nova pessoa - (2) - Mostrar mulheres - (3) - Finalizar");
           resposta = scanner.nextLine();

           switch (resposta){
               case "1":
                   System.out.println("Digite seu nome: ");
                   String nome = scanner.nextLine();
                   System.out.println("Sexo (F/M): ");
                   String sexo = scanner.nextLine();
                   if (sexo.equalsIgnoreCase("F")){
                       IPessoa mulher = new MulherConcreta(nome);
                       adicionarEmUmaLista(mulher, listaDePessoas);
                   }else{
                       IPessoa pessoa = new Pessoa(nome, sexo);
                       adicionarEmUmaLista(pessoa, listaDePessoas);
                   }
                   break;
               case "2":
                   List<IPessoa> mulheres = listaDePessoas.stream()
                           .filter(p -> p.getSexo() == "Feminino")
                           .collect(Collectors.toList());

                       System.out.println("Mulheres na lista: ");
                   for(IPessoa mulher : mulheres){
                       System.out.println(" - " + mulher.getNome());

                   }
                   break;
           }

       }while (!resposta.equalsIgnoreCase("3"));
    }

    public void adicionarEmUmaLista(IPessoa pessoa,ArrayList<IPessoa> listaDePessoas){
        listaDePessoas.add(pessoa);
    }
}
