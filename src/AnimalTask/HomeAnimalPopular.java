package AnimalTask;

public class HomeAnimalPopular extends HomeAnimalKind{
    private boolean popular;

    public HomeAnimalPopular() {
    }


    public HomeAnimalPopular(boolean popular) {
        this.popular = popular;
    }

    public HomeAnimalPopular(boolean plantEating, boolean popular) {
        super(plantEating);
        this.popular = popular;
    }

    public HomeAnimalPopular(String name, boolean plantEating, boolean popular) {
        super(name, plantEating);
        this.popular = popular;
    }
    public HomeAnimalPopular(String kind, int age, String name, boolean plantEating, boolean popular) {
        super(kind, age, name, plantEating);
        this.popular = popular;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    @Override
    public String toString() {
        return "AnimalTask.HomeAnimalPopular{" +
                "popular=" + popular +
                "} " + super.toString();
    }
}
