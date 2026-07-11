public class Magazine extends Publication implements Borrowable {

    private int volume;
    private int issueNumber;

    public Magazine(String title, String author, String publisher,
                    int yearOfPublication, int volume, int issueNumber) {
        super(title, author, publisher, yearOfPublication);
        this.volume = volume;
        this.issueNumber = issueNumber;
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

