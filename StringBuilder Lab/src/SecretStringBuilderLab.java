import java.io.*;
import java.util.Scanner;


public class SecretStringBuilderLab {

	public static void main(String[] args) throws IOException{
		File file = new File ("secret.txt");
        Scanner inputFile = new Scanner(file);

        String string = "";
        int count = 0;
        char letter;

        StringBuilder strb = new StringBuilder();

        string = inputFile.nextLine();

        String [] tokens = string.split(" ");

        for (String s: tokens){
            if (count % 5 == 0){
                letter = s.charAt(0);
                letter = Character.toUpperCase(letter);
                strb.append(letter);
            }
            count++;
        }
        System.out.println(strb);

        inputFile.close();
    }
}
