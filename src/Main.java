import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {
        menueführung();

    }

    private static void menueanzeigen(){
        System.out.println("""
                ---Menue---
                1. Addieren
                2. Subtrahieren
                3. Multiplication
                4. Dividieren
                5. Exit
                """);
    }

    private static void menueführung() {
        while (true) {
            menueanzeigen();
            System.out.println("Bitte Menüpunkt auswählen: ");
            int operation = eingabe.nextInt();
            switch (operation) {
                case 1 -> { addition();
                }
                case 2 -> { subtrahieren();
                }
                case 3 -> { multiplication();
                }
                case 4 -> {
                    System.out.println(dividieren(zahleneingabe()));
                }
                case 5 -> {
                    return;
                }
            }
        }
    }

    private static double[] zahleneingabe(){
        System.out.println("Bitte geben Sie Ihre Zahlen ein.");
        System.out.println("Mit Leerzeichen getrennt z.B 1 4 7");
        System.out.println("Eingabe: ");
        String zaleneingabe = eingabe.next();
        String[] zahlenString = zaleneingabe.split(" ");
        return strinZuIntArray(zahlenString);
    }

    private static double[] strinZuIntArray(String[] array){
        double[] neuesArray = new double[array.length];
        for (int i = 0; i < array.length; i++){
            neuesArray[i] = Double.parseDouble(array[i]);
        }
        return neuesArray;
    }

    private static double dividieren(double[] array) {
        double ergebnis = array[0];
        for (int i = 1; i < array.length; i++){
            ergebnis /= array[i];
        }
        return ergebnis;
    }

    private static void multiplication() {
    }

    private static void subtrahieren() {
    }

    private static void addition() {
    }
}
