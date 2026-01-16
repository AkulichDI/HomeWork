package CodingBat.warmup1;

public class IcyHot {

    /*
    * Для двух заданных температур верните true, если одна из них меньше 0, а другая больше 100.
    * icyHot(120, -1) → true
    * icyHot(-1, 120) → true
    * icyHot(2, 120) → false
    * */



    public boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 || temp2 > 100 ) && (temp1 < 0 || temp2 < 0  );
    }

}
