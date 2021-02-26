package WearTask;

public class Woman extends Human implements WearWoman{
    private  boolean married;

    public Woman() {
    }

    public Woman(boolean married) {
        this.married = married;
    }

    public Woman(String name, int age, boolean married) {
        super(name, age);
        this.married = married;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public void dressWoman() {
        System.out.println("Типу Оділи чувіху");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "married=" + married +
                "} " + super.toString();
    }
}
