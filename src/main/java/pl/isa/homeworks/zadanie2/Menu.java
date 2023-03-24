package pl.isa.homeworks.zadanie2;

import java.util.List;
import java.util.Scanner;

public class Menu {
    protected void showMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Wybierz numer menu");
            System.out.println("1. Widok dzieł");
            System.out.println("2. Dodaj dzieło");
            System.out.println("3. Zakończ program");

            if (scanner.hasNextInt()) {
                int userChoose = scanner.nextInt();
                if (userChoose > 0 && userChoose < 4) {
                    if (userChoose == 1) break;
                    else if (userChoose == 2) {
                        System.out.println("druga metoda");
                    }
/*                    switch (userChoose) {
                        case 1 -> goto List<CulturalPiece>;
                        case 2 -> System.out.println("2. Dodaj dzieło"); // add method
                        case 7 -> {
                            System.out.println("Zakończ program");
                            isContinue = false;
                        }
                    }*/
                } else {
                    System.out.println("Wybrano niewłaściwy numer");
                    isContinue = false;
                }
            } else {
                System.out.println("Wybierz poprawny numer menu");
                break;
            }
        }
    }
}
