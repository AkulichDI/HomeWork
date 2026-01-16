package CodingBat.warmup1;

public class LoneTeen {


/*

    Мы будем называть число «подростковым», если оно находится в диапазоне от 13 до 19 включительно.
    Для двух целых чисел верните true, если одно из них или оба являются подростковыми, но не оба сразу.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false

*/




    public boolean loneTeen(int a, int b) {
        boolean teenA = a >= 13 && a <= 19;
        boolean teenB = b >= 13 && b <= 19;
        return teenA ^ teenB;
    }


}
