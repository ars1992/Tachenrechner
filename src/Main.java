import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(zahleneingabe()));
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
            String operation = eingabe.nextLine();

            switch (operation) {
                case "1" -> {
                    System.out.println(addition(zahleneingabe()));
                }
                case "2" -> {
                    System.out.println(subtrahieren(zahleneingabe()));
                }
                case "3" -> {
                    System.out.println(multiplication(zahleneingabe()));
                }
                case "4" -> {
                    System.out.println(dividieren(zahleneingabe()));
                }
                case "5" -> {
                    return;
                }
                default -> {
                    System.out.println("Menüpunkt nicht vorhanden!");
                }
            }
        }
    }

    private static double[] zahleneingabe(){
        System.out.println("Bitte geben Sie Ihre Zahlen ein.");
        System.out.println("Mit Leerzeichen getrennt z.B 1 4 7");
        System.out.println("Eingabe: ");
        String zahleneingabe = eingabe.nextLine();
        String[] zahlenString = zahleneingabe.split(" ");
        return stringZuDoubleArray(zahlenString);
    }

    private static double[] stringZuDoubleArray(String[] array){
        double[] neuesArray = new double[array.length];
        for (int i = 0; i < array.length; i++){
            try {
                neuesArray[i] = Double.parseDouble(array[i]);

            } catch (NumberFormatException ex){
                System.out.println("Fehlerhafte Eingabe!");
                zahleneingabe();
            }
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

    private static double multiplication(double[] array) {
        double ergebnis = array[0];
        for (int i = 1; i < array.length; i++){
            ergebnis *= array[i];
        }
        return ergebnis;
    }

    private static double subtrahieren(double[] array) {
        double ergebnis = array[0];
        for (int i = 1; i < array.length; i++){
            ergebnis -= array[i];
        }
        return ergebnis;
    }

    private static double addition(double[] array) {
        double ergebnis = array[0];
        for (int i = 1; i < array.length; i++){
            ergebnis += array[i];
        }
        return ergebnis;
    }
}
