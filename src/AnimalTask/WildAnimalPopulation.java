package AnimalTask;

public class WildAnimalPopulation extends WildAnimalKind{
    private int population;

    public WildAnimalPopulation() {
    }

    public WildAnimalPopulation(int population) {
        this.population = population;
    }

    public WildAnimalPopulation(boolean plantEating, int population) {
        super(plantEating);
        this.population = population;
    }

    public WildAnimalPopulation(String habitat, boolean plantEating, int population) {
        super(habitat, plantEating);
        this.population = population;
    }

    public WildAnimalPopulation(String kind, int age, String habitat, boolean plantEating, int population) {
        super(kind, age, habitat, plantEating);
        this.population = population;
    }


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "AnimalTask.WildAnimalPopulation{" +
                "population=" + population +
                "} " + super.toString();
    }
}
