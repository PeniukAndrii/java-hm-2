package AnimalTask;

public class HomeAnimal extends Animal{
    private String name;

    public HomeAnimal() {
    }

    public HomeAnimal(String name) {
        this.name = name;
    }

    public HomeAnimal(String kind, int age, String name) {
        super(kind, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "AnimalTask.HomeAnimal{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
