package no.src;

public class Lista {
    //Construtor (inicializa os atributos da classe)//

    No inicio;
    No fim;
    int tamanho;

    //Construtor

    Lista(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    void adicionar(String nome, String tel){
        No no = new No(nome, tel);
        if(estaVazia()){
            inicio = no;
        }
        else{
            fim.proximo = no;
        }
        fim = no;
        tamanho++;
    }

    //Método para ver se a lista está vazia
    boolean estaVazia(){
        //Retorna um boolean
        return tamanho == 0;
    }

    void imprimir(){
        No no = inicio;
        for(int i = 0; i < tamanho; i++){
            System.out.println(no.nome + "\n" + no.tel);
            no = no.proximo;
        }
    }

    String retornarInfo(String nome){

        No no = inicio;

        for(int i = 0; i < tamanho; i++){
            if(no.nome.equals(nome)){
                return no.tel;
            }
            no = no.proximo;
        }

        return "Não localizado";
    }

}
