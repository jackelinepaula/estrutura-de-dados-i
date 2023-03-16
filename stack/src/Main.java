public class Main {
    public static void main(String[] args){
//        System.out.println(mult(4, 2));

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

        if(v2 == 1){
            return v1;
        }
        else{
            return v1 + multRec(v1, v2-1);

//            Ex com 4 e 2
//                4 + multiRec(v1, v2-1)
//                    4 + 4 -> (multRec(v1, v2-1))


        }
    }

}
