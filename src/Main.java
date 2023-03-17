import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Läs in alla rader från en fil och spara alla de rader som
        // innehåller en viss text i en annan fil

        String fromFile = "chat.txt";
        String toFile = "search.txt";

        Scanner input = new Scanner(System.in);
        System.out.print("Vad skall vi söka efter? ");
        String search = input.nextLine();

        BufferedReader fileIn = new BufferedReader(new FileReader(fromFile));
        PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter(toFile)));

        while (true) {
            String line = fileIn.readLine();
            if (line == null) {
                break;
            }
            if (line.indexOf(search) >= 0) {
                fileOut.println(line);
            }
        }
        fileIn.close();
        fileOut.close();
    }
}