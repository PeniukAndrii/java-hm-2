package AnimalTask;

public class WildAnimalKind extends WildAnimal{
    private boolean plantEating;

    public WildAnimalKind() {
    }

    public WildAnimalKind(boolean plantEating) {
        this.plantEating = plantEating;
    }

    public WildAnimalKind(String habitat, boolean plantEating) {
        super(habitat);
        this.plantEating = plantEating;
    }

    public WildAnimalKind(String kind, int age, String habitat, boolean plantEating) {
        super(kind, age, habitat);
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
        return "AnimalTask.WildAnimalKind{" +
                "plantEating=" + plantEating +
                "} " + super.toString();
    }
}
