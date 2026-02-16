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

/*
    Даны две строки a и b. Создайте более длинную строку, состоящую из первого символа a, первого символа b, второго символа a, второго символа b и так далее.
    Все оставшиеся символы добавляются в конец результата.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
*/

    public String mixString(String a, String b) {

        int max = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder(a.length() + b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length()) sb.append(a.charAt(i));
            if (i < b.length()) sb.append(b.charAt(i));
        }
        return sb.toString();

    }

/*
    Для заданной строки и целого числа n верните строку, состоящую из n повторений последних n символов исходной строки.
    Можно предположить, что n находится в диапазоне от 0 до длины строки включительно.

   repeatEnd("Hello", 3) → "llollollo"
   repeatEnd("Hello", 2) → "lolo"
   repeatEnd("Hello", 1) → "o"

 */

    public String repeatEnd(String str, int n) {

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            sb.append(str.substring(str.length() - n));
        }
        return sb.toString();
    }


/*
    Учитывая строку и значение int n, верните строку, состоящую из первых n символов строки, за которыми следуют первые n-1 символы строки, и так далее.
    Вы можете предположить, что n находится между 0 и длиной строки включительно (т.е. n >= 0 и n <= str.length()).

    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"
*/

    public String repeatFront(String str, int n) {

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            if (i < str.length()) sb.append(str.substring(0, n - i));


        }
        return sb.toString();
    }

    /*
        Для двух строк word и разделителя sep верните большую строку, состоящую из count вхождений слова, разделенных строкой-разделителем.

        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"
     */

    public String repeatSeparator(String word, String sep, int count) {

        StringBuilder sb = new StringBuilder(word.length() * count);

        for (int i = 0; i < count; i++) {
            sb.append(word);
            if (i < count - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

}
