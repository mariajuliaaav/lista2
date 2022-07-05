import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n, fat = 1;
        int c = 1;

        do {
            System.out.println("Insira um número: ");
            n = tec.nextInt();

            for (int m = 1; m <= n; m++) {
                fat = fat * m;
            }

            System.out.println("O fatorial de: " + n + " é " + fat + ".");
            c++;

        } while (c < 2);
    }
}