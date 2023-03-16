package no.src;

public class Pilha {

    int tamanho;
    No topo;

    Pilha(){
        tamanho = 0;
        topo = null;
    }

    boolean isEmpty(){
        return tamanho == 0;
    }

    void empilhar(Object info){
        No no = new No(info);

        if(isEmpty() == false){
            no.proximo = topo;
        }

        //C - (B)
        //B - (A)
        //A - null

        topo = no;
        tamanho++;
    }

    Object topo(){
        if(isEmpty()){
            return "Está vazia";
        }
        else{
            return topo.info;
        }
    }

    Object desempilhar(){
        if(isEmpty()){
            return "Está vazia";
        }

        Object info = topo.info;
        topo = topo.proximo;
        tamanho--;

        return info;
    }

}
