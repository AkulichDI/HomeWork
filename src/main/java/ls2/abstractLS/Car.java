package ls2.abstractLS;

public class Car extends Transport{
    public Car(String model) {
        super(model);
    }

    @Override
    public int maxSpeed() {
        return 180;
    }
}
