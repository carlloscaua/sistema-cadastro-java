
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();

                lista.add(new Pessoa(nome, idade));
                System.out.println("Pessoa cadastrada!");

            } else if (opcao == 2) {
                System.out.println("\nLista de pessoas:");
                for (Pessoa p : lista) {
                    p.exibir();
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}
