import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número de 0 a 500: ");
        double n = entrada.nextDouble();

        if (n >= 100 && n <= 200) {
            System.out.println("Você digitou um número entre 100 e 200!");
        } else {
            System.out.println("Você digitou um número fora da faixa!");
        }
    }
}