package pl.isa.homeworks.zadanie2;

public class Painting extends CulturalPiece {
    @Override
    public String[] getExperiences() {
        return new String[]{"viewing paintings"};
    }

    @Override
    public String getCreatedBy() {
        return "Painted by: " + author;
    }

    public Painting(String title, String author) {
        super(title, author);
    }
}