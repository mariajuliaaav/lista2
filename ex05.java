import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner agenda = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("|------   Menu   -------|");
            System.out.println("| 0 - Sair              |");
            System.out.println("| 1 - Adicionar contato |");
            System.out.println("| 2 - Buscar contato    |");
            System.out.println("| 3 - Remover contato   |");
            System.out.println("| 4 - Editar contat     |");
            System.out.println("-------------------------");
            System.out.println("Escolha uma opção: ");
            opcao = agenda.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o número de telefone: ");
                    int contato = agenda.nextInt();
                    break;
                case 2:
                    System.out.println("Insira o número de telefone: ");
                    int buscar = agenda.nextInt();
                    break;
                case 3:
                    System.out.println("Remover o contato: ");
                    int remover = agenda.nextInt();
                    break;
                case 4:
                    System.out.println("Editar o contato: ");
                    int editar = agenda.nextInt();
                    break;
            }
        } while (opcao != 0);
    }
}