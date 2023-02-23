public class Fibonacci {
    public static void main (String[] args){

        int atual = 1;
        int anterior = 0;
        int res = 0;

        for(int i = 0; i < 50; i = res){
            System.out.println(atual);
            res = atual + anterior;
            anterior = atual;
            atual = res;
        }

    }
}
