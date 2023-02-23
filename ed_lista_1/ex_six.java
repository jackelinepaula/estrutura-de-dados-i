import java.util.Scanner;
public class ex_six {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.println("Entre com o 1° valor");
        a = scan.nextInt();
        System.out.println("Agora o 2° valor");
        b = scan.nextInt();
        System.out.println("Agora o 3° valor");
        c = scan.nextInt();

        int[] valores = {a, b, c};
        int countPositive = 0;
        int countNegative = 0;

        for(int i = 0; i < 3; i++){
            if(valores[i] > 0){
                countPositive++;
            }else if(valores[i] < 0){
                countNegative++;
            }
        }

        System.out.println(countNegative+" valor(es) negativo(s)");
    }
}
