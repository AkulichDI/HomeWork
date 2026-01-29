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
/*
    Верните количество вхождений строки «code» в заданную строку, за исключением того, что вместо «d» может быть любая буква, поэтому «cope» и «cooe» тоже учитываются.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
*/
    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if ( str.startsWith("co",i) && str.startsWith("e", i + 3))counter++;
        }
        return counter;
    }

/**
    Для двух строк верните значение true, если одна из строк встречается в самом конце другой строки,
    без учёта разницы в регистре (другими словами, вычисления не должны зависеть от регистра).
    Примечание: str.toLowerCase() возвращает строку в нижнем регистре.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
 */

    public boolean endOther(String a, String b) {

        String an = a.toLowerCase();
        String bn = b.toLowerCase();

        return an.endsWith(bn) || bn.endsWith(an);
    }

}
