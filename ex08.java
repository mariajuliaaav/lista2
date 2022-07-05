import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        metodolampada l = new metodolampada();
        Scanner entrada = new Scanner(System.in);
        int comando;

        System.out.println("O estado da lâmpada é: ");
        l.estadol();

        do {
            System.out.println("1 - Ligar a lâmpada.");
            System.out.println("2 - Desligar a lâmpada.");
            System.out.println("3 - Ver o estado da lâmpada.");
            System.out.println("0 - Sair.");
            System.out.println("Insira uma opção: ");
            comando = entrada.nextInt();

            switch (comando) {
                case 1:
                    l.acender();
                    System.out.println("A lâmpada está ligada. \n");
                    break;
                case 2:
                    l.apagar();
                    System.out.println("A lâmpada está desligada. \n");
                    break;

                case 3:
                    l.estadol();
                    break;
            }
        } while (comando != 0);
    }
}