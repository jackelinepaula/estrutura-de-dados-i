import java.util.Random;

public class DesafioSorteio {
    public static void main(String[] args){
        Random random = new Random();

        int n = 30;
        int valor;

        int[] valores = new int[n];


        for(int i = 0; i < valores.length; i++){
            valor = random.nextInt(100);

            //Variavel para verificar se tem o valor
            boolean repetido = false;
            //Percorrendo o vetor
            for(int j = 0; j < valores.length; j++){
                if(valor == valores[j]){
                    //Caso seja true já encerra o bloco
                    repetido = true;
                    break;
                }
            }

            //Pra add no vetor repetido precisa ser false
            if(repetido == false){
                valores[i] = valor;
                System.out.print(valores[i]+ " ");
            }
            //Se não reinicia o loop

        }



    }
}
