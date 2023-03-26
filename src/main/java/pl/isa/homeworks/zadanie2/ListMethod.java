package pl.isa.homeworks.zadanie2;

import java.util.List;
import java.util.Scanner;

public class ListMethod {

    static void showDefaultList(List<CulturalPiece> culturalPieces) {
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

    static void addMusic(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the music title");
        String title = scanner.nextLine();
        System.out.println("Enter the music author");
        String author = scanner.nextLine();
        culturalPieces.add(new Music(title, author));
    }

    static void addMovie(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie title");
        String title = scanner.nextLine();
        System.out.println("Enter the movie author");
        String author = scanner.nextLine();
        culturalPieces.add(new Movie(title, author));
    }

    static void addPainting(List<CulturalPiece> culturalPieces) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the painting title");
        String title = scanner.nextLine();
        System.out.println("Enter the painting author");
        String author = scanner.nextLine();
        culturalPieces.add(new Painting(title, author));
    }
}