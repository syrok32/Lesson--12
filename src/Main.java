public class Main {
    public static void main(String[] args) {
        Book sarah = new Book("Sarah", 30);

        Book bookCat = new Book("Stepan", 1992);
        Book bookDog = new Book("Dima", 2000);
        Author authorCat = new Author("Stepan", "Stepanov");
        Author authorDog = new Author("Dima", "Dmitrev");
        System.out.println(bookCat.getYearPublic());
        bookCat.setYearPublic(1900);
        System.out.println(bookCat.getYearPublic());


    }


}

