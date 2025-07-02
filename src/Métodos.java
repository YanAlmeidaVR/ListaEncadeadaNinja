import java.util.LinkedList;
import java.util.Scanner;

public class Métodos {

    public void exibirMenu(){
        System.out.println("LISTA ENCADEADA DE NINJAS");
        System.out.println("1 - Adicionar novo ninja");
        System.out.println("2 - Adicionar o ninja no inicio da lista");
        System.out.println("3 - Remover o primeiro ninja da lista");
        System.out.println("4 - Listar ninjas");
        System.out.println("5 - Localizar ninja por index");
        System.out.println("6 - Encerrar programa");
        System.out.print("Opção: ");
    }

    public void adicionarNinja(LinkedList<Ninja> ninjas, Scanner sc){
        System.out.print("Nome do ninja: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Idade do ninja: ");
        int idade = sc.nextInt();
        System.out.print("Qual vila pertence: ");
        String vila = sc.nextLine();
        sc.nextLine();
        if (nome == null || idade < 0 || vila == null) return;
        Ninja ninja = new Ninja(nome,idade,vila);
        ninjas.add(ninja);
        System.out.println("Adicionado com sucesso!");
    }

    public void adicionarNinjaInicioDaLista(LinkedList<Ninja> ninjas, Scanner sc){
        System.out.print("Nome do ninja: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Idade do ninja: ");
        int idade = sc.nextInt();
        System.out.print("Qual vila pertence: ");
        String vila = sc.nextLine();
        sc.nextLine();
        if (nome == null || idade < 0 || vila == null) return;
        Ninja ninja = new Ninja(nome,idade,vila);
        ninjas.addFirst(ninja);
        System.out.println("Adicionado ao primeiro da lista com sucesso!");
    }

    public void removerNinjaInicioDaLista(LinkedList<Ninja> ninja){
        Ninja removido = ninja.removeFirst();
        System.out.println("Ninja removido : " + removido);
    }

    public void ListarNinja(LinkedList<Ninja> ninjas){
        System.out.println("------- Lista de ninjas -------");
        for (Ninja ninja : ninjas){
            System.out.println(ninja);
        }
        System.out.println("-----------------------------");
    }

    public void ProcurarPorIndex(LinkedList<Ninja> ninjas,Scanner sc){
        System.out.println("Qual indíce você deseja saber o conteúdo?");
        int index = sc.nextInt();
        Ninja ninja = ninjas.get(index);
        System.out.println("Na posição " + index + ": " + ninja);
    }

}
