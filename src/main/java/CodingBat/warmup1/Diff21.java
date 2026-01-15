package CodingBat.warmup1;

public class Diff21 {

    /*
    * Для заданного целого числа n верните абсолютную разницу между n и 21, но если n больше 21, верните удвоенную абсолютную разницу.
    * diff21(19) → 2
    * diff21(10) → 11
    * diff21(21) → 0
    */

    public int diff21(int n) {

         if (Math.abs(n) > 21 ){
             return  (Math.abs(n) - 21 )  * 2;
         }

        return 21 -  n;
    }


}
