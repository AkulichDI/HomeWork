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
    endOther("abc", "abXabc") → true*/

    public boolean endOther(String a, String b) {

        String an = a.toLowerCase();
        String bn = b.toLowerCase();

        return an.endsWith(bn) || bn.endsWith(an);
    }

/*
    Верните true, если в заданной строке есть вхождение "xyz", где перед xyz нет точки (.).
    То есть "xxyz" подходит, а "x.xyz" — нет.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
 */

    public boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("xyz", i)) {
                if (i == 0 || str.charAt(i - 1) != '.') return true;
            }
        }
        return false;

    }
/*
    Верните true, если заданная строка содержит подстроку «bob», но при этом средний символ «o» может быть любым.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
*/

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if ( str.startsWith("b",i ) && str.startsWith("b", i + 2)  )return true;
        }
        return false;
    }
/*
    Мы будем говорить, что строка сбалансирована по x и y, если для всех символов x в строке где-то в конце есть символ y.
    Таким образом, «xxy» сбалансировано, а «xyx» — нет. Один символ y может сбалансировать несколько символов x.
    Верните true, если заданная строка сбалансирована по x и y.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
*/

    public boolean xyBalance(String str) {

        boolean seenY = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == 'y') seenY = true;
            if (ch == 'x' && !seenY) return false;
        }
        return true;

    }
}
