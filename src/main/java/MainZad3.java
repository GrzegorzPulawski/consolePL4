import java.util.Locale;
import java.util.Scanner;

public class MainZad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
       do {
        System.out.println("Podaj tekst");
        tekst = scanner.next();

        if (!tekst.equals("quit"))
       {

        System.out.println(tekst.toUpperCase());
            }
       } while(!tekst.equals("quit"));

        }

    }