import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        readArchive();
        writeArchive();
    }

    private static void writeArchive() throws IOException{
        final String ARCHIVE_EXIT = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\cancao_do_douglas.txt";

        //Esse cria o arquivo de escrita
        FileWriter fw = new FileWriter(ARCHIVE_EXIT);
        //Esse de fato escreve o arquivo
        BufferedWriter bw = new BufferedWriter(fw);

        String linha = "Eu não falo mais com talarico(Douglas)";
        bw.write(linha);
        bw.newLine();

        linha = "Talarico roubou minha mulher";
        bw.write(linha);

        //Commit
        bw.flush();
    }

    private static void readArchive() throws IOException {
        final String ARCHIVE_X = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\samba_enredo.txt";

        //Esse encontra o arquivo
        FileReader fr = new FileReader(ARCHIVE_X);
        //Esse lê de fato o arquivo
        BufferedReader br = new BufferedReader(fr);

        String linha = br.readLine();
//        System.out.println(linha);

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
    }
}
