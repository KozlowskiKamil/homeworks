package pl.isa.homeworks.zadanie2;

public class Music extends CulturalPiece {
    @Override
    public String[] getExperiences() {
        return new String[]{"listening music"};
    }

    @Override
    public String getCreatedBy() {
        return "Composed by: " + author;
    }

    public Music(String title, String author) {
        super(title, author);
    }
}
