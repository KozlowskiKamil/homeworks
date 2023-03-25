package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu implements ListMethod{
    protected void showMenu() {

        Scanner scanner = new Scanner(System.in);
        CulturalPiecesApp addCulturalPiece = new CulturalPiecesApp();
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
                        addCulturalPiece.addMusic();
                    } else if (userChoose == 3) {
                        System.out.println("Program finished, goodbye");
                        System.exit(0);
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

/*    private static void addMusic(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        culturalPieces.add(new Music(input, input2));*/
    }
}