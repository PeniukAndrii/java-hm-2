package BookTask;

public class Book extends Papyrus {
    private int Pages;

    public Book() {
    }

    public Book(int size) {
        Pages = size;
    }

    public Book(String material, int size) {
        super(material);
        Pages = size;
    }

    public int getSize() {
        return Pages;
    }

    public void setSize(int size) {
        Pages = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Size=" + Pages +
                "} " + super.toString();
    }
}
