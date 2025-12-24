package ls2.interfaceLS;

public class Salary implements Payable {

    private final int amount;


    public Salary (int amount){
        Payable.validatorAmount(amount);
        this.amount = amount;
    }


    @Override
    public int pay() {
        return amount;
    }
}
