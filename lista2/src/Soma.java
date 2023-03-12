import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e;
        int soma;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();
        System.out.println("Digite o terceiro valor");
        c = scan.nextInt();
        System.out.println("Digite o quarto valor");
        d = scan.nextInt();
        System.out.println("Digite o quinto valor");
        e = scan.nextInt();

        soma = a + b + c + d + e;

        System.out.println("Soma = "+soma);
    }
}
