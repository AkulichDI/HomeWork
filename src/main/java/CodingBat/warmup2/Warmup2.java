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



/*
    Для заданной строки и неотрицательного целого числа n мы будем считать, что начало строки — это первые 3 символа или любой другой символ, если длина строки меньше 3.
    Верните n копий начала строки.

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
*/


    public String frontTimes(String str, int n) {

        if (n == 0) return "";
        String result = "";
        if (str.length()>3){
        for (int i = 0; i <n ; i++) {
            result += str.substring(0,3);
        }
        }else  {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        }
        return result;
    }


}
