public class ManipulandoString {
    public static void main(String args[]){

        metodoSubstring();
        metodoSplit();
        metodoDate();

    }

    private static void metodoSubstring() {
        String dateUSA = "2022/05/25";
        String dateBR = null;

        String dia, mes, ano;

        ano = dateUSA.substring(0, 4);
        mes = dateUSA.substring(5, 7);
        dia = dateUSA.substring(8);

        dateBR = dia + "/" + mes + "/" + ano;

        System.out.println(dateBR);
    }

    private static void metodoSplit(){
        String nomeCompleto = "Jackeline Paula Teles Menezes";
        String[] nomesplit = nomeCompleto.split(" ");

        for(int i = 0; i < nomesplit.length; i++){
            System.out.println(nomesplit[i]);
        }

    }

    private static void metodoDate(){
        String dateUSA = "2022/05/25";
        String dateBR = null;

        String[] datasplit = dateUSA.split("/");

        dateBR = datasplit[2] + "/" + datasplit[1] + "/" + datasplit[0];

        System.out.println(dateBR);
    }
}
