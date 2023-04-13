public class TestePilha {
    public static void main(String[] args){

        Pilha pilha = new Pilha();
        Pilha pilhaAux = new Pilha();

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("E");


        while(pilha.tamanho > 1){
            pilhaAux.empilhar(pilha.desempilhar());
        }

        pilha.desempilhar();

        while(pilhaAux.tamanho > 0){
            pilha.empilhar(pilhaAux.desempilhar());
        }

        System.out.println("Pilha principal");
        while(pilha.tamanho > 0){
            System.out.println(pilha.desempilhar());
        }


    }

}
