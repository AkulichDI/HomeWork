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



/*
        Дана строка. Рассмотрим префикс, состоящий из первых N символов строки.
        Встречается ли этот префикс в строке еще где-нибудь? Предположим, что строка не пустая и что N находится в диапазоне от 1 до str.length().

        prefixAgain("abXYabc", 1) → true
        prefixAgain("abXYabc", 2) → true
        prefixAgain("abXYabc", 3) → false
 */

    public boolean prefixAgain(String str, int n) {

        String tmp = str.substring(0, n);

        for (int i = n; i < str.length(); i++ ) {

            if ( str.startsWith(tmp, i) ) return true;

        }
        return false;
    }

/*
        Есть ли в строке слово "xyz"? Чтобы определить середину строки, мы будем считать, что количество символов слева и справа от "xyz" отличается не более чем на один.
        Эта задача сложнее, чем кажется.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false
 */

    public boolean xyzMiddle(String str) {

        int pos = str.indexOf("xyz");
        while (pos != -1) {
            int left = pos;
            int right = str.length() - (pos + 3);
            if (Math.abs(left - right) <= 1) return true;

            pos = str.indexOf("xyz", pos + 1);
        }
        return false;
    }

/*
        Сэндвич — это два куска хлеба с чем-то между ними.
        Верните строку, которая находится между первым и последним вхождением слова "хлеб" в заданной строке, или верните пустую строку "", если хлеба было не два куска.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""
 */
    public String getSandwich(String str) {

        int first = str.indexOf("bread");
        int last  = str.lastIndexOf("bread");

        if (first == -1 || first == last) return "";
        return str.substring(first + 5, last);

    }

/*
        Возвращает true, если для каждого символа '*' (звездочки) в строке символы, стоящие непосредственно до и после звездочки, совпадают.

        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true
 */

    public boolean sameStarChar(String str) {

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;

    }

/*
        Для заданной строки вычислите новую строку, переместив первый символ так, чтобы он стоял после следующих двух символов, то есть из строки "abc" получится "bca".
        Повторите этот процесс для каждой последующей группы из трех символов, то есть из строки "abcdef" получится "bcaefd".
        Не учитывайте группы из менее чем трех символов в конце.

        oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"
 */

    public String oneTwo(String str) {

        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i + 2 < str.length(); i += 3) {
            sb.append(str, i + 1, i + 3).append(str.charAt(i));
        }
        return sb.toString();
    }

/*
        Найдите в строке такие шаблоны, как «zip» и «zap», — длиной 3 символа, начинающиеся с «z» и заканчивающиеся на «p».
        Верните строку, в которой из всех таких слов удалена средняя буква, то есть из «zipXzap» получится «zpXzp».

        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"
 */

    public String zipZap(String str) {

        StringBuilder sb = new StringBuilder(str.length());

        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {

                sb.append('z').append('p');
                i += 3;
            } else {
                sb.append(str.charAt(i));
                i += 1;
            }
        }

        return sb.toString();
    }

/*
        Верните версию заданной строки, в которой для каждой звездочки (*) в строке звездочка и символы слева и справа от нее удалены.
        Таким образом, из строки "ab*cd" получится "ad", а из строки "ab**cd" — тоже "ad".

        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"
 */

    public String starOut(String str) {
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length() ; i++) {
            boolean  leftStar = (i > 0 && str.charAt(i-1) == '*');
            boolean  rightStar = (i < str.length()-1 && str.charAt(i+1) == '*');

            if (str.charAt(i) != '*' && !leftStar && !rightStar) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

/*
        Для заданной строки и непустой строки word верните версию исходной строки, в которой все символы заменены на плюсики ("+"),
        кроме вхождений строки word, которые остаются без изменений.

        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

    public String plusOut(String str, String word) {
        int w = word.length();
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); ) {
            if (i + w <= str.length() && str.regionMatches(i, word, 0, w)) {
                sb.append(word);
                i += w;
            } else {
                sb.append('+');
                i++;
            }
        }
        return sb.toString();
    }
}
