package no.src;

public class No {
    String nome;
    String tel;
    Object info;
    No proximo;
    //Um construtor com parâmetros é obrigado a receber informaçoes quando instanciado.
    No(Object info){
//        this.nome = nome;
//        this.tel = tel;
        this.info = info;
        this.proximo = null;
    }
}
