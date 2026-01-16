package CodingBat.warmup1;

public class Close10 {



    /*
    Для двух целых чисел верните то, которое ближе к значению 10, или 0 в случае равенства. Обратите внимание, что Math.abs(n) возвращает абсолютное значение числа.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
     */


    public int close10(int a, int b) {

        int da = Math.abs(10 - a);
        int db = Math.abs(10 - b);

        if (da == db) return 0;
        return da < db ? a : b;
    }

}
