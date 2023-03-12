import java.util.Scanner;

public class Negativo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e;

        System.out.println("Entre com o 1° valor");
        a = scan.nextInt();
        System.out.println("Agora o 2° valor");
        b = scan.nextInt();
        System.out.println("Agora o 3° valor");
        c = scan.nextInt();
        System.out.println("Mais um");
        d = scan.nextInt();
        System.out.println("O último");
        e = scan.nextInt();

        int[] valores = {a, b, c, d, e};
        int countPositive = 0;
        int countNegative = 0;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] > 0){
                countPositive++;
            }else if(valores[i] < 0){
                countNegative++;
            }
        }

        System.out.println(countNegative+" valor(es) negativo(s)");
    }
}
