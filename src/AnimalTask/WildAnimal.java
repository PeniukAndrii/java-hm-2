package AnimalTask;

public class WildAnimal extends Animal{
    private String habitat;

    public WildAnimal() {
    }

    public WildAnimal(String habitat) {
        this.habitat = habitat;
    }

    public WildAnimal(String kind, int age, String habitat) {
        super(kind, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "AnimalTask.WildAnimal{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
