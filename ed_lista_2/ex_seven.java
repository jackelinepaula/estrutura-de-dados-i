import java.util.Scanner;

public class ex_seven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Tecle 'Enter' a cada valor que digitar");
        int valor = scan.nextInt();
        do{
            valor = scan.nextInt();

        }while(valor != 0);

        System.out.println("Programa encerrado");
    }
}
