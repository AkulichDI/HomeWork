package ls2.interfaceLS;

public interface Payable {
    public int pay();
    default boolean isPositive(){return pay() > 0;}
    public static void validatorAmount(int amount){
        if ( amount< 0 ){
            throw new IllegalArgumentException("Меньше 0 ");
        }
    }

}
