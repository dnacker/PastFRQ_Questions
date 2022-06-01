package Q2;

public class TextBook extends Book {
    private int edition;

    public TextBook(String bookTitle, double bookPrice, int edition) {
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    int getEdition() {
        return edition;
    }

    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    boolean canSubstituteFor(TextBook other) {
        return other.getTitle().equals(getTitle()) && edition >= other.edition;
    }
}
