import java.util.Scanner;
public class ex_three {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja a tabuada de qual número?");
        int n = scan.nextInt();
        int res = 0;

        for(int i = 0; i <= 10; i++){
            res = n * i;
            System.out.println(n+" X "+i+" = "+res);
        }
    }
}
