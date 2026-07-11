

public class Book extends Publication implements Borrowable {
    private String isbn;

    public Book(String title, String author, String publisher,
                int yearOfPublication, String isbn)
    {
        super(title, author, publisher, yearOfPublication);
        this.isbn = isbn;

    }


    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("ISBN: "+isbn);
    }


    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
