import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número de 0 a 100: ");
        double n = entrada.nextDouble();

        if (n >= 0 && n <= 100) {
            if (n % 2 == 0) {
                System.out.println("Número par!");
            } else {
                System.out.println("Número ímpar!");
            }
        }
    }
}