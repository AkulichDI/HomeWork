package CodingBat.string;

public class String2 {
/*
    Данную строку нужно преобразовать так, чтобы для каждого символа в исходной строке было по два символа.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
 */

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder(str.length()*2);
        for ( char el : str.toCharArray()){
            result.append(el).append(el);
        }
        return result.toString();

    }
/*
    Верните количество вхождений строки «hi» в заданную строку.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
 */
    public int countHi(String str) {

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) count++;
        }
        return count;

    }

/*
    Верните true, если строки «cat» и «dog» встречаются в заданной строке одинаковое количество раз.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
*/

    public boolean catDog(String str) {

        int dogCount = 0, catCount = 0;

        for (int i = 0; i < str.length()-2; i++) {

            if (str.startsWith("cat",i)) catCount++;
            if (str.startsWith("dog",i)) dogCount++;

        }
        return catCount == dogCount;
    }



}
