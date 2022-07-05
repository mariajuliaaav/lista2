import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner raiz = new Scanner(System.in);
        int m = 0;

        while (m < 10) {
            System.out.printf("Insira um número: ");
            double n = raiz.nextDouble();
            System.out.printf("A raiz quadrada de " + n + " é: " + Math.sqrt(n) + ". ");
            m += 1;
        }
    }
}