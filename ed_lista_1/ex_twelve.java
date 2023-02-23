import java.util.Scanner;

public class ex_twelve {
    public static void main(String[] args){
        int i = 0;
        String string = "*";

        for(i = 0; i < 5; i++){
            System.out.println(string);
            string = string+"*";
        }

        for(i = 5; i >= 0; i--){
            string = string.substring(0, string.length() - 1);
            System.out.println(string);
        }
    }
}
