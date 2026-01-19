package CodingBat.warmup2;

public class Warmup2 {
    /*

        Даны строка и неотрицательное целое число n. Верните строку, которая состоит из n копий исходной строки.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"
    */


public String stringTimes(String str, int n) {

    String result = "";

    for (int i = 0; i < n; i++) {
        result += str;
    }
    return result;
}











}
