package lista1.src;

import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        System.out.println("Entre com o 1° valor");
        a = scan.nextDouble();
        System.out.println("Agora o 2° valor");
        b = scan.nextDouble();
        System.out.println("Por fim, o 3° valor");
        c = scan.nextDouble();

        if(a == b && b == c){
            System.out.println("É um triângulo equilátero");
        }else{
            System.out.println("Não é um triângulo equilátero");
        }

    }
}
