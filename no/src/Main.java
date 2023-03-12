package no.src;

public class Main {
    public static void main(String[] args){

        Lista lista = new Lista();

        lista.adicionar("Jack", "11988996655");
        lista.adicionar("Pedro", "11987653456");
        lista.adicionar("Victor", "11986345466");

//        lista.imprimir();

        System.out.println(lista.retornarInfo("Douglas"));
    }
}
