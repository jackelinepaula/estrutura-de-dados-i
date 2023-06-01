public class Main {
    public static void main(String[] args){

        int[][] matriz = {
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };

        boolean chegou = busca(5, 7, matriz);

    }

    private static boolean busca(int origem, int destino, int[][] matriz) {

        for(int i = 0; i < destino; i++){

            if(matriz[i][origem] != 0){
                  return true;
            }

        }

        return false;
    }
}
