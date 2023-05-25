public class ManipulandoString {
    public static void main(String args[]){

        metodoSubstring();

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
}
