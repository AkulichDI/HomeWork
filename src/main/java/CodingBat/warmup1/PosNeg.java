package CodingBat.warmup1;

public class PosNeg {

    /*
    * Для двух целых чисел верните true, если одно из них отрицательное, а другое положительное.
    * За исключением случаев, когда параметр «отрицательный» равен true, в этом случае верните true, только если оба числа отрицательные.
    * posNeg(1, -1, false) → true
    * posNeg(-1, 1, false) → true
    * posNeg(-4, -5, true) → true
    */

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


}
