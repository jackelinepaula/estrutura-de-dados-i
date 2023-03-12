package lista1.src;

import java.util.Scanner;
public class Voto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade");
        idade = scan.nextInt();

        if(idade < 16){
            System.out.println("Não vota ainda");
        }else if(idade == 16 || idade == 17 || idade > 70){
            System.out.println("O voto é facultativo");
        }else if(idade >= 18 && idade <=70){
            System.out.println("Voto obrigatório");
        }
    }
}
