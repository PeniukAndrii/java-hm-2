package WearTask;

public class Man extends Human implements WearMan{
    private boolean car;

    public Man() {
    }

    public Man(boolean car) {
        this.car = car;
    }

    public Man(String name, int age, boolean car) {
        super(name, age);
        this.car = car;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    @Override
    public void dressMan() {
        System.out.println("І типу оділи челіка");
    }

    @Override
    public String toString() {
        return "Man{" +
                "car=" + car +
                "} " + super.toString();
    }
}
