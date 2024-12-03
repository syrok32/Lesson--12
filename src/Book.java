import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.toString() +
                ", yearPublic=" + yearPublic +
                '}';
    }
}
