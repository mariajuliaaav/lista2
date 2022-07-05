import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número:");
        int numero = teclado.nextInt();

        System.out.println("");
        System.out.println("Os 20 primeiros múltiplos desse número é: ");

        for (int m = 1; m <= 20; m++) {
            System.out.println(numero + " x " + m + " = " + numero * m);
        }
    }
}