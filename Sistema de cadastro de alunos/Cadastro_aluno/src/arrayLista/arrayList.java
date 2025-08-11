package arrayLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class arrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //adicionar dados na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //inserir elemento em uma determinada posição
        list.add(2, "Marco");

        //tamanho da lista
        System.out.println(list.size());

        for(String name : list) {
            System.out.println(name);

        }
        System.out.println("-------------------------------------------");
        //remover alguem da lista
        //list.remove(1); //pode escrever a posição, o nome

        //agora pelo predicado, como a primeira letra do nome
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println("---------------------------------");
        //encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        //quando o indexOf não encontra um elemento, ele retorna -1
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        //filtrar alguem pela letra, etc.
        // usar collect(Collectors.toList()) se for um valor mutavel
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String name : result) {
            System.out.println(name);
        }

        System.out.println("--------------------------------");
        String name = list.stream().filter(x -> x.charAt(1) == 'n').findFirst().orElse(null);
        System.out.println(name);

    }
}
