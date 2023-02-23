public class ex_13 {
    public static void main(String[] args){

        int n = 9;
        //Espaço
        int i = (n-1)/2;
        //Asterisco
        int a = 1;


        for(i = i; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= a; j++){
                System.out.print("*");
            }

            a += 2;
            System.out.println();
        }


        for(i = i; a > 0; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= a; j++){
                System.out.print("*");
            }

            a -= 2;
            System.out.println();
        }
    }
}
