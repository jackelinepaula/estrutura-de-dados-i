public class Main {
    public static void main(String[] args){
        System.out.println(multRec(4, 3));

    }

//    public static double mult(double v1, double v2){
//
//        double resul = 0;
//
//        for(int i = 1; i <= v1; i++){
//            resul = resul + v2;
//        }
//
//        return resul;
//    }

    //Recurisvidade
    static double multRec(double v1, double v2){

        //Enquanto o v2 não for 1, a recursividade vai acontecer
        if(v2 == 1){
            return v1;
        }
        else{
            return v1 + multRec(v1, v2-1);

//            Ex com 4 e 3
//                4 + multiRec(4, 2)
//                    4 + multRec(4, 1)

        }
    }

}
