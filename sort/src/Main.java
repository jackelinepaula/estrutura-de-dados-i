public class Main {
    public static void main(String[] args){

        int[] vetor = {7, 9, 5, 1, 2};
        meuSort(vetor);

    }
    private static void meuSort(int[] vetor){

        for(int i = 0; i < vetor.length; i++){

            //função java para pegar o maior valor possível
            int menor = Integer.MAX_VALUE;

            //pegando valor da posição[i] porque ele será sutituído
            int troca = vetor[i];
            //pegando o menor indice para troca
            int indice = i;

            for(int j = i; j < vetor.length; j++){
                if(vetor[j] < menor){
                    //se a posição[j] for menor que o atual menor, então o menor atual passa ser
                    //a posição[j]
                    menor = vetor[j];
                    indice = j;
                }
            }
            //posição[i] atual recebe menor
            vetor[i] = menor;
            //posição[indicemenor] recebe o valor que foi substituído
            vetor[indice] = troca;
        }

        for(int r = 0; r < vetor.length; r++){
            System.out.println(vetor[r]);
        }

    }

    public void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+i];
                    arr[j+1] = temp;
                }

            }
        }
    }
}
