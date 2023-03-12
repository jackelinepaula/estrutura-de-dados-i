package lista1.src;

import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        int soma;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();
        System.out.println("Digite o terceiro valor");
        c = scan.nextInt();

        soma = a + b + c;

        System.out.println("Soma = "+soma);
    }
}