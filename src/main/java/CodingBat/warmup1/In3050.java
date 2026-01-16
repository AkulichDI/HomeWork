package CodingBat.warmup1;

public class In3050 {
/*
    Для двух целых чисел верните true, если они оба находятся в диапазоне от 30 до 40 включительно или в диапазоне от 40 до 50 включительно.
    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
 */

    public boolean in3050(int a, int b) {

        if ( (a >= 30 && a <= 40) && ( b >= 30 && b <= 40 ) ) return true;
        if ( (a >= 40 && a <= 50) && ( b >= 40 && b <= 50 ) ) return true;
        return false;

    }

}
