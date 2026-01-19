package CodingBat.warmup2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

/*
    Подсчитайте количество «xx» в заданной строке. Допустим, что перекрытие разрешено, поэтому в «xxx» содержится 2 «xx».

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
*/

    int countXX(String str) {

        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

/*
    Для заданной строки верните значение true, если за первым вхождением символа «x» в строке сразу следует другой символ «x».
    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
*/

    boolean doubleX(String str) {

        int i = str.indexOf("x");
        if (i == -1) return false;

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }


}
