public class Book extends Publication {
    private String isbn;
    private int numbreOfPages;

    public Book(String title, String author, String publisher,
                int yearOfPublication, String isbn, int numbreOfPages) {
        super(title, author, publisher, yearOfPublication);
        this.isbn = isbn;
        this.numbreOfPages = numbreOfPages;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("ISBN: "+isbn);
    }

    
}
