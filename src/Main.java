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
                case 4 -> { dividieren();
                }
                case 5 -> {
                    return;
                }
            }
        }
    }

    private static void dividieren() {
    }

    private static void multiplication() {
    }

    private static void subtrahieren() {
    }

    private static void addition() {
    }
}
