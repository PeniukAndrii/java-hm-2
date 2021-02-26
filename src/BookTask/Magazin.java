package BookTask;

public class Magazin extends Book{
    private String type;

    public Magazin() {
    }

    public Magazin(String type) {
        this.type = type;
    }

    public Magazin(int size, String type) {
        super(size);
        this.type = type;
    }

    public Magazin(String material, int size, String type) {
        super(material, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
