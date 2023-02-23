import java.util.Scanner;
public class IgualOuNao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Entre com o valor A");
        a = scan.nextInt();
        System.out.println("Agora o valor B");
        b = scan.nextInt();

        if(a > b){
            System.out.println("A é maior que B");
        }else if(b > a){
            System.out.println("B é maior que A");
        }else{
            System.out.println("Os valores são iguais");
        }

    }
}
