public class Book {
    private String title;
    private Author author;
    private int yearPublic;

    public Book(String title, int yearPublic, Author author) {
        this.title = title;
        this.yearPublic = yearPublic;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }
    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
