import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos andares tem o prédio: ");
        int totalandar = entrada.nextInt() - 1;

        System.out.print("Insira a capacidade máxima de pessoas no elevador: ");
        int totalpessoa = entrada.nextInt();

        metodoelevador m = new metodoelevador(totalpessoa, totalandar);

        int opcao = 0;
        do {
            System.out.println("1 - Entrar no elevador.");
            System.out.println("2 - Sair do elevador.");
            System.out.println("3 - Subir um andar.");
            System.out.println("4 - Descer um andar.");
            System.out.println("0 - Sair do programa.");
            System.out.println("Digite uma opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    m.entrar();
                    break;
                case 2:
                    m.sair();
                    break;
                case 3:
                    m.subir();
                    break;
                case 4:
                    m.descer();
                    break;

            }
        } while (opcao != 0);
    }
}