package BookTask;

public class Papyrus {
    private String material;

    public Papyrus() {
    }

    public Papyrus(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                '}';
    }
}
