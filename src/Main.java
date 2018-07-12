import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int liczba;
        boolean value = true;

        do{
            System.out.println("Podaj liczbę z zakresu od 100 do 200 podzielną przez 3: ");
            liczba = scan.nextInt();
            if(liczba < 100){
                System.out.println("Liczba jest za mała");
            }
            else if(liczba > 200){
                System.out.println("Podana liczba jest większa od 200");
            }
            else if(liczba > 100 && liczba < 200 && liczba % 3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }
            else if(liczba % 3 == 0){
                System.out.println("Twoja liczba jest poprawna");
                value = false;
            }
        }
        while(value);


    }
}
