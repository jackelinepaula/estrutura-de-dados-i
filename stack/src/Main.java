public class Main {
    public static void main(String[] args){
        System.out.println(mult(4, 2));
    }

    public static double mult(double v1, double v2){

        double resul = 0;

        for(int i = 1; i <= v1; i++){
            resul = resul + v2;
        }

        return resul;
    }
}
