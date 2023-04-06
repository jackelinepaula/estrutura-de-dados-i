import javax.swing.*;

public class Main {

    static  int op = 0;
    static Fila fila = new Fila();

    public static void main(String[] args){

        do{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Digite a opção"
                                    +"\n 1 - Enfileirar"
                                    +"\n 2 - Início"
                                    +"\n 3 - Desenfileirar"
                                    +"\n 0 - Sair"));

            switch(op){
                case 1:{
                    String tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa");
                    fila.enfileirar(tarefa);
                    break;
                }
                case 2:{
                    String tarefaInicio = (String) fila.showInicio();
                    JOptionPane.showMessageDialog(null, tarefaInicio);
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, fila.desenfileirar());
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null, fila.print());
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                }
            }

        }
        while(op != 0);

    }

}
