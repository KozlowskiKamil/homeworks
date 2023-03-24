package pl.isa.homeworks.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class CulturalPiecesApp {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.showMenu();

        List<CulturalPiece> culturalPieces = new ArrayList<>();
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
}
