package CodingBat.warmup1;

public class In1020 {

    /**
     *
     *Для двух целых чисел верните true, если хотя бы одно из них находится в диапазоне от 10 до 20 включительно.
     *
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     * **/



    public boolean in1020(int a, int b) {
        return ( a >= 10 && a <= 20 ) || ( b >= 10 && b <= 20 );
    }


}
