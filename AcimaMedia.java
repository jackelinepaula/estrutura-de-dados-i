import java.util.Scanner;

public class AcimaMedia {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas serão?");
        int quantidade = scan.nextInt();

        double[] notas = new double[quantidade];
        double soma = 0;
        double media = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Entre com a nota");

            notas[i] = scan.nextDouble();
            soma += notas[i];
        }

        media = soma / quantidade;

        System.out.printf("A média é: %.1f%n\nNotas acima da média: ", media);
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > media){
                System.out.println(notas[i]);
            }
        }
    }
}
