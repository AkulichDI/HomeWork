package CodingBat.warmup1;

public class HasTeen {

    /*
    Мы будем называть число «подростковым», если оно находится в диапазоне от 13 до 19 включительно.
    Для трёх целых чисел верните true, если одно или несколько из них являются подростковыми.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
    */


    public boolean hasTeen(int a, int b, int c) {
        byte min = 13;
        byte max = 19;

        return (a >= min && a <= max) || (b >= min && b <= max) || (c >= min && c <= max);

    }
}
