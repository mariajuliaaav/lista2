import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        Scanner media = new Scanner(System.in);

        int m = 1;
        int soma = 0;
        double total = 0;

        while (m <= 10) {
            System.out.println("Insira um número: ");
            int n = media.nextInt();

            if (n % 3 == 0) {
                soma += n;
                total++;
            }
            m++;
        }
        total = soma / total;

        System.out.println("A média dos números múltiplos de 3 é: " + total);

    }
}