package CodingBat.warmup1;

public class Makes10 {
   /*
    * Даны два целых числа a и b. Верните true, если одно из них равно 10 или если их сумма равна 10.
    * makes10(9, 10) → true
    * makes10(9, 9) → false
    * makes10(1, 9) → true
    */

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a + b == 10;
    }



}
