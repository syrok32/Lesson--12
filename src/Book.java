public class Book {
    private String author;
    private int yearPublic;

    public Book(String author, int yearPublic) {
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
