package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pl.isa.homeworks.zadanie2.ListMethod.*;

public class Menu {
    protected void showMenu() {

        List<CulturalPiece> culturalPieces = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("\nSelect a menu number");
            System.out.println("1. Watch masterpieces");
            System.out.println("2. Add a masterpiece of music");
            System.out.println("3. Add a masterpiece of movie");
            System.out.println("4. Add a masterpiece of painting");
            System.out.println("5. Finish the program");

            if (scanner.hasNextInt()) {
                int userChoose = scanner.nextInt();
                if (userChoose > 0 && userChoose < 6) {
                    if (userChoose == 1) {
                        showDefaultList(culturalPieces);
                    } else if (userChoose == 2) {
                        addMusic(culturalPieces);
                    } else if (userChoose == 3) {
                        addMovie(culturalPieces);
                    } else if (userChoose == 4) {
                        addPainting(culturalPieces);
                    } else if (userChoose == 5) {
                        System.out.println("Program finished, goodbye");
                        isContinue = false;
                    }
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