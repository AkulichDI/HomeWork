package ls2.interfaceLS;

public class Refund implements Payable{
    private final int amount;


    public Refund (int amount){
        Payable.validatorAmount(amount);
        this.amount = amount;
    }

    @Override
    public int pay() {
        return -amount;
    }
}
