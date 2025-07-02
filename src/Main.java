import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> ninjas = new LinkedList<Ninja>();
        Métodos md = new Métodos();
        Scanner sc = new Scanner(System.in);
        boolean parar = false;
        int opção;

        ninjas.add(new Ninja("Naruto",16,"Aldeia da Folha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjas.add(new Ninja("Gaara", 17, "Areia"));
        ninjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        ninjas.add(new Ninja("Temari", 18, "Areia"));

        do {
            md.exibirMenu();
            opção = sc.nextInt();

            switch (opção){
                case 1:
                    md.adicionarNinja(ninjas,sc);
                    break;
                case 2:
                    md.adicionarNinjaInicioDaLista(ninjas,sc);
                    break;
                case 3:
                    md.removerNinjaInicioDaLista(ninjas);
                    break;
                case 4:
                    md.ListarNinja(ninjas);
                    break;
                case 5:
                    md.ProcurarPorIndex(ninjas,sc);
                    break;
                case 6:
                    parar = true;

            }


        }while (!parar);
    }
}
