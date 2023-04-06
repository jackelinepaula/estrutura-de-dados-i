public class Fila {

    int tamanho;
    No inicio;
    No fim;

    Fila(){
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    boolean isEmpty(){
        return tamanho == 0;
    }

    void enfileirar(Object info){
        //Criei um nó
        No no = new No(info);


        if(isEmpty()){
            //Se estiver vazia, o nó tambem será o início da fila
            this.inicio = no;
        }else{
            this.fim.proximo = no;
        }

        //Este nó será o fim, assim como todos que forem inseridos
        this.fim = no;
        //Alterei o tamanho da lista
        tamanho++;
    }

    Object desenfileirar(){
        if(isEmpty()){
            return "Está vazia";
        }

        Object info = inicio.info;
        inicio = inicio.proximo;

        tamanho --;

        return info;
    }

    Object showInicio(){
        if(isEmpty()){
            return "Está vazia";

        }else{
            return inicio.info;
        }
    }

    String print(){
        No no = inicio;


        String string = "";

        for(int i = 0; i < tamanho; i++){

            string += "\n" + no.info;
            no = no.proximo;

        }

        return string;
    }
}
