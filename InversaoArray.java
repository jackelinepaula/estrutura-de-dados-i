public class InversaoArray {
    public static void main(String[] args){

        String[] nomes = {"Ana", "Marcos", "João"};
        String[] inversao = new String[3];

        int j = 0;

        for(int i = nomes.length - 1; i >= 0; i--){
           inversao[j] = nomes[i];
            j++;
        }


    }
}
