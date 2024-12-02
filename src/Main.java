public class Main {
    public static void main(String[] args) {

        Author authorCat = new Author("Stepan", "Stepanov");
        Author authorDog = new Author("Dima", "Dmitrev");


        Book bookCat = new Book("Stepan", 1992, authorCat);
        Book bookDog = new Book("Dima", 2000, authorDog);


        System.out.println(bookCat.getYearPublic());
        bookCat.setYearPublic(1900);
        System.out.println(bookCat.getYearPublic());


    }


}

