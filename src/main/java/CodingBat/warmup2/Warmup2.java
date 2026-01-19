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


        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
    }

/*
    Для заданной строки верните новую строку, состоящую из всех остальных символов, начиная с первого, то есть «Hello» превратится в «Hlo».

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
*/


    public String stringBits(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0){
                continue;
            }
            result += str.charAt(i);
        }
        return  result;
    }

/*
    Для непустой строки, например «Code», верните строку, например «CCoCodCode».

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
*/

    public String stringSplosion(String str) {

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            result += str.substring(0,i);

        }

        return result + str;
    }



/*
    Для заданной строки верните количество вхождений подстроки длиной 2,
    а также двух последних символов строки, например, для строки «hixxxhi» будет выведено 1 (мы не будем учитывать конечную подстроку).


    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
 */

    public int last2(String str) {

        int result = 0;

        if ( str.length() <= 1 ) return result;

        String data = str.substring(str.length()-2);

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 2).equals(data) ){

                result++;
            }
        }
        return result;
    }

/*
    Дан массив целых чисел. Найдите в нём количество девяток.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3

*/

    public int arrayCount9(int[] nums) {

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

/*
    Дан массив целых чисел. Верните true, если один из первых 4 элементов массива равен 9. Длина массива может быть меньше 4.
    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
*/
    public boolean arrayFront9(int[] nums) {

        if (nums == null ) return false;

        for (int i = 0; i < nums.length; i++) {
            if ( i == 4 ) return false;
            if (nums[i] == 9) return true;
        }
        return false;
    }





}
