package ls2.abstractLS;

public class Bicycle extends Transport{

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public int maxSpeed() {
        return 30;
    }
}
