package BookTask;

public class Comic extends Book{
    private String about;

    public Comic(){
    }

    public Comic(String about) {
        this.about = about;
    }

    public Comic(String material, int size) {
        super(material, size);
    }

    public Comic(String material, int size, String about) {
        super(material, size);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "about='" + about + '\'' +
                "} " + super.toString();
    }
}
