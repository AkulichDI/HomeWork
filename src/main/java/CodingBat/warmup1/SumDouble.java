package CodingBat.warmup1;

public class SumDouble {

   /*
    * Даны два целых числа. Верните их сумму. Если два числа равны, верните их удвоенную сумму.
    * sumDouble(1, 2) → 3
    * sumDouble(3, 2) → 5
    * sumDouble(2, 2) → 8
   */


    public int sumDouble(int a, int b) {
       int sum = a + b;
        if ( a == b ) return sum * 2 ;
        return sum;
    }


}
