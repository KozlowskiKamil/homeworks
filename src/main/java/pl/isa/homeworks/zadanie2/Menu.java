package pl.isa.homeworks.zadanie2;

import java.util.Scanner;

public class Menu {
    protected void showMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Select a menu number");
            System.out.println("1. Watch masterpieces");
            System.out.println("2. Add a masterpiece");
            System.out.println("3. Finish the program");

            if (scanner.hasNextInt()) {
                int userChoose = scanner.nextInt();
                if (userChoose > 0 && userChoose < 4) {
                    if (userChoose == 1) break;
                    else if (userChoose == 2) {
                        System.out.println("druga metoda");
                    } else if (userChoose == 3) {
                        System.out.println("Program finished, goodbye");
                        System.exit(0);
                    }
/*                    switch (userChoose) {  nie mogę wyjść ze switch do kontunuacji programu w klasie Main dopytać
                        case 1 -> goto List<CulturalPiece>;
                        case 2 -> System.out.println("2. Dodaj dzieło"); // add method
                        case 7 -> {
                            System.out.println("Zakończ program");
                            isContinue = false;
                        }
                    }*/
                } else {
                    System.out.println("Wrong number selected");
                    System.exit(0);
                }
            } else {
                System.out.println("Wrong character selected");
                System.exit(0);
            }
        }
    }
}