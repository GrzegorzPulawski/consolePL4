import java.util.Scanner;

public class MainZadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj początek zakresu");
        int poczatek = scanner.nextInt();

        System.out.println("podaj koniec zakresu");
        int koniec = scanner.nextInt();

        for (int i = poczatek; i < koniec; i++){
            if (poczatek > koniec) {
                System.out.println("Podałes bledne dane");
            }
        }
    }
}
