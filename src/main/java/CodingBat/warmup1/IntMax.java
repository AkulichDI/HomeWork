package CodingBat.warmup1;

public class IntMax {

/*

Даны три целых числа: a, b и c. Найдите наибольшее из них.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3


 */

    public int intMax(int a, int b, int c) {
        int ab =  Math.max(a,b);
        return Math.max(ab, c);
    }

}
