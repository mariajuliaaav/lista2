import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        metodoconta m = new metodoconta();

        System.out.print("Insira o nome do cliente: ");
        String nome = entrada.nextLine();
        m.setnome(nome);
        System.out.print("Insira o número da conta: ");
        String numero = entrada.nextLine();
        m.setnumero(numero);
        System.out.print("Insira o saldo: ");
        float saldo = entrada.nextFloat();
        m.setsaldo(saldo);

        int opcao = 0;
        do {
            System.out.println("1 - Depositar. ");
            System.out.println("2 - Sacar. ");
            System.out.println("3 - Imprimir os dados da conta. ");
            System.out.println("0 - Sair. ");
            System.out.println("Insira uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor que deseja depositar: ");
                    float deposito = entrada.nextFloat();
                    m.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja sacar:");
                    float sacar = entrada.nextFloat();
                    m.sacar(sacar);
                    break;
                case 3:
                    System.out.printf("Nome do cliente: " + m.getnome() + ", Número da conta: " + m.getnumero()
                            + ", Saldo: " + m.getsaldo() + "\n");
            }
        } while (opcao != 0);
    }
}