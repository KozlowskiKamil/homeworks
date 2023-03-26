package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CulturalPiecesApp {
    public static void main(String[] args) {

        CulturalPiecesApp culturalPiecesApp = new CulturalPiecesApp();
        //   List<CulturalPiece> culturalPieces = new ArrayList<>();
        culturalPiecesApp.showMenu();
    }

    private static void showDefaultList(List<CulturalPiece> culturalPieces) {
        culturalPieces.add(new Movie("The Shawshank Redemption", "Stephen King"));
        culturalPieces.add(new Movie("Forrest Gump", "Eric Roth"));
        culturalPieces.add(new Painting("Mona Lisa", "Leonardo da Vinci"));
        culturalPieces.add(new Painting("The Persistence of Memory", "Salvador Dalí"));
        culturalPieces.add(new Music("Californication", "Red Hot Chili Peppers"));
        culturalPieces.add(new Music("Lose Yourself", "Eminem"));

        for (CulturalPiece piece : culturalPieces) {
            System.out.println("Title: " + piece.getTitle());
            System.out.println(piece.getCreatedBy());
            System.out.println("It can be experienced by: " + String.join(", ", piece.getExperiences()));
        }
    }

    private static void addMusic(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the music title");
        String title = scanner.nextLine();
        System.out.println("Enter the music author");
        String author = scanner.nextLine();
        culturalPieces.add(new Music(title, author));
    }
    private static void addMovie(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie title");
        String title = scanner.nextLine();
        System.out.println("Enter the movie author");
        String author = scanner.nextLine();
        culturalPieces.add(new Music(title, author));
    }
    private static void addPainting(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the painting title");
        String title = scanner.nextLine();
        System.out.println("Enter the painting author");
        String author = scanner.nextLine();
        culturalPieces.add(new Music(title, author));
    }

    protected void showMenu() {

        //    CulturalPiecesApp culturalPiecesApp = new CulturalPiecesApp();
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