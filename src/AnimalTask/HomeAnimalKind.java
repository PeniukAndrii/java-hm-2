package AnimalTask;

public class HomeAnimalKind extends HomeAnimal{
    private boolean plantEating;

    public HomeAnimalKind() {
    }

    public HomeAnimalKind(boolean plantEating) {
        this.plantEating = plantEating;
    }

    public HomeAnimalKind(String name, boolean plantEating) {
        super(name);
        this.plantEating = plantEating;
    }

    public HomeAnimalKind(String kind, int age, String name, boolean plantEating) {
        super(kind, age, name);
        this.plantEating = plantEating;
    }

    public boolean isPlantEating() {
        return plantEating;
    }

    public void setPlantEating(boolean plantEating) {
        this.plantEating = plantEating;
    }

    @Override
    public String toString() {
        return "AnimalTask.HomeAnimalKind{" +
                "plantEating=" + plantEating +
                "} " + super.toString();
    }
}
