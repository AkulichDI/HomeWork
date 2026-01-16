package CodingBat.warmup1;

public class MixStart {

/*
    Возвращает true, если заданная строка начинается с "mix", за исключением того, что 'm' может быть любой буквой, поэтому "pix", "9ix" и т. д. тоже подходят.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false

*/

    public boolean mixStart(String str) {
        if ( str.startsWith("ix", 1)) return true;
        return false;
    }
}
