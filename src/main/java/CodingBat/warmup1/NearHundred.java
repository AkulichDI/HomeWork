package CodingBat.warmup1;

public class NearHundred {


    /*
    * Для заданного целого числа n верните true, если оно находится в пределах 10 от 100 или 200.
    * Примечание: Math.abs(num) вычисляет абсолютное значение числа.
    * nearHundred(93) → true
    * nearHundred(90) → true
    * nearHundred(89) → false
    */

    public static boolean nearHundred(int n) {
        return ((n >= 90 && n <= 110) || n >= 190 && n <= 210 );
    }



}
