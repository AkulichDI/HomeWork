package ls2.abstractLS;

public abstract class Transport {
    private final String model;

    public Transport(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("model не должна быть пустой");
        }
        this.model = model.trim();
    }

    public String getModel() {
        return model;
    }

    public abstract int maxSpeed();

    public String info() {
        return "model=" +this.model + ", maxSpeed=" + maxSpeed();
    }
}
