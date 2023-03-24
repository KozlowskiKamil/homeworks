package pl.isa.homeworks.zadanie2;

public class Movie extends CulturalPiece {
    @Override
    public String[] getExperiences() {
        return new String[]{"watching movie"};
    }

    @Override
    public String getCreatedBy() {
        return super.getCreatedBy(); // Jedną zostawiam oryginalną aby użyć "super"
    }

    public Movie(String title, String author) {
        super(title, author);
    }
}
