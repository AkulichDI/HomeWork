package CodingBat.warmup2;

import java.util.*;
import java.util.stream.Collectors;

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

/*
    Дан массив целых чисел. Верните true, если в массиве есть последовательность чисел 1, 2, 3.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true

 */
    public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2 ; i++) {
            if ( nums[i] == 1 && nums[i+1] == 2 && nums[i+2]==3)return true;
        }
        return false;

    }

/*
    Для двух строк, a и b, верните количество позиций, в которых они содержат подстроку одинаковой длины 2.
    Например, для строк "xxcaazz" и "xxbaaz" будет выведено 3, так как подстроки "xx", "aa" и "az" встречаются в обеих строках в одних и тех же местах.
    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0

 */

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }
/*
    Данную строку нужно преобразовать так, чтобы все символы «x» были удалены.
    Исключение составляет символ «x» в самом начале или в самом конце строки, который удалять не нужно.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"

 */

    public String stringX(String str) {

        String result = "";
        for (int i=0; i<str.length(); i++) {

            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;


    }



/*
    Для заданной строки верните строку, состоящую из символов по индексам 0, 1, 4, 5, 8, 9 ... так, чтобы из «kittens» получилось «kien».

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
*/

    public String altPairs(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
            }
        }

        return sb.toString();


    }



/*
    Предположим, что строка «yak» приносит несчастье. Данную строку нужно преобразовать так, чтобы из неё исчезли все «yak», но при этом «a» могла быть любым символом.
    Строки «yak» не должны пересекаться.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"
*/

        public String stringYak(String str) {
            String result = str.replaceAll("y.k", "");

            return result;
        }

    public static void main(String[] args) {
        System.out.println(new Warmup2().stringYak("xxxyakyyyakzzz"));
    }


/*

    Дан массив целых чисел.
    Верните количество пар чисел 6, расположенных рядом в массиве.
    Также посчитайте количество случаев, когда вторая «6» на самом деле является числом 7.

    array667([6, 6, 2]) → 1
    array667([6, 6, 2, 6]) → 1
    array667([6, 7, 2, 6]) → 1
*/
    public int array667(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if ( nums[i] == 6){
                if (nums[i+1] == 6 || nums[i+1] == 7){
                    result++;
                }
            }
        }

        return result;
    }

/*
    Для массива целых чисел тройкой назовём значение, которое встречается в массиве три раза подряд.
    Верните true, если в массиве нет троек.

    noTriples([1, 1, 2, 2, 1]) → true
    noTriples([1, 1, 2, 2, 2, 1]) → false
    noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

    public boolean noTriples(int[] nums) {

            for (int i=0; i < (nums.length-2); i++) {
                int first = nums[i];
                if (nums[i+1]==first && nums[i+2]==first) return false;
            }

        return true;
    }
/*
    Подсчитайте количество «xx» в заданной строке. Допустим, что перекрытие разрешено, поэтому в «xxx» содержится 2 «xx».
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3

 */


        int countXXXXl(String str) {
            if (str == null  || str.trim().isEmpty()) return 0;
            int counter = 0;

            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == 'x' || str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == 'X') {
                    counter++;
                }
            }
            return counter;
        }





}
