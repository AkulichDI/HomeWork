package CodingBat.string1;

import java.util.Locale;

public class String1 {

/*
    Если задано строковое имя, например «Боб», верните приветствие в формате «Привет, Боб!».

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
 */

    public String helloName(String name) {

        return "Hello " + name + "!";
    }

/*
    Даны две строки, a и b. Верните результат их объединения в порядке abba, например, «Hi» и «Bye» возвращают «HiByeByeHi».

    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"

 */

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

/*
    Веб-страницы создаются с помощью HTML-строк, таких как "<i>Yay</i>", которые выделяют слово Yay курсивом.
    В этом примере тег "i" образует <i> и </i>, которые окружают слово "Yay". По заданным тегам и словам создайте HTML-строку с тегами вокруг слова, например "<i>Yay</i>".
    makeTags("i", "Ура") → "<i>Ура</i>"
    makeTags("i", "Привет") → "<i>Привет</i>"
    makeTags("cite", "Ура") → "<cite>Ура</cite>"

 */

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</"+ tag +">";
    }


/*
    Дано: строка «out» длиной 4 символа, например «<<>>"», и слово. Необходимо вернуть новую строку, в которой слово находится в середине строки «out», например «<<word>>"».
    Примечание: используйте str.substring(i, j), чтобы извлечь строку, начинающуюся с индекса i и заканчивающуюся индексом j, но не включающую его.
    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"

 */

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }



/*
    Дана строка. Верните новую строку, состоящую из трёх копий двух последних символов исходной строки. Длина строки будет не менее 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
*/
    public String extraEnd(String str) {
        String result = "";
        for (int i = 0; i < 3; i++) {
            result += str.substring(str.length()-2);
        }
        return result;
    }

/*
    Для заданной строки верните строку, состоящую из первых двух символов исходной строки. Например, для строки «Hello» верните «He».
    Если длина строки меньше двух символов, верните то, что есть, например, для строки «X» верните «X», а для пустой строки верните пустую строку. Обратите внимание,
     что str.length() возвращает длину строки.

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"

 */

    public String firstTwo(String str) {
        if ( str.length() <= 1 ) return str;

        return str.substring(0,2);

    }

/*
    Для строки чётной длины верните первую половину. Таким образом, строка «WooHoo» преобразуется в «Woo»
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"

 */

    public String firstHalf(String str) {

        if (str.length() % 2 == 0 ) return str.substring(0,str.length()/2);
        else return str;

    }


/*
    Для заданной строки верните версию без первого и последнего символов, чтобы из "Hello" получилось "ell". Длина строки будетне меньше 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"

 */

    public String withoutEnd(String str) {
        if ( str.length() >= 1 ) return str.substring(1,str.length() - 1);
        return str;
    }

/*
    Даны две строки, a и b. Верните строку в формате short+long+short, где более короткая строка находится снаружи, а более длинная — внутри.
    Строки не будут иметь одинаковую длину, но могут быть пустыми (длина 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab

 */

    public String comboString(String a, String b) {
        if ( a.length() > b.length()  ) return b + a + b;
        else return a + b + a;
    }


/*
    Даны две строки. Верните их конкатенацию, за исключением первого символа каждой из них.
    Длина строк должна быть не меньше 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"

 */

    public String nonStart(String a, String b) {
        if (a == null || a.trim().isEmpty() || b == null || b.trim().isEmpty()) return a + b;
        return a.substring(1) + b.substring(1);


    }

/*
    Для заданной строки верните «повёрнутую влево на 2 символа» версию, в которой первые 2 символа перемещены в конец. Длина строки будет не менее 2 символов.

    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"

 */

    public String left2(String str) {
        if ( str.length() < 1 ) return str;
        return str.substring(2)+ str.substring(0,2);
    }

/*
    Для заданной строки верните «повернутую вправо на 2 символа» версию, в которой последние 2 символа перемещены в начало. Длина строки должна быть не менее 2 символов.
    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"

 */
    public String right2(String str) {
        if ( str.length() < 1 ) return str;
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);

    }
    /*
    Для заданной строки верните строку длиной 1, начинающуюся с её начала, если только начало не равно false, в этом случае верните строку длиной 1, начинающуюся с конца.
     Строка не будет пустой.


    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"

     */

    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }else{
            return str.substring(str.length()-1);
        }
    }

/*
    Данную строку нужно преобразовать так, чтобы в ней не было ни первого, ни последнего символа.
    Строка может быть любой длины, включая 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""

 */

    public String withouEnd2(String str) {
        if (str == null || str.trim().isEmpty()) return "";
        if (str.length() <=1) return "";

        return str.substring(1, str.length()-1);
    }

/*
    Для строки чётной длины верните строку, состоящую из двух средних символов, например, для строки «string» верните «ri».
    Длина строки будет не менее 2.
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"

 */

    public String middleTwo(String str) {
        if (str.length() <=1) return str;
        return str.substring(str.length()/2 - 1 , str.length()/2 +1);

    }
/*
    Для заданной строки верните значение true, если она заканчивается на «ly».

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false

 */
    public boolean endsLy(String str) {
        if ( str == null || str.length() <=1 ||  str.trim().isEmpty() ) return false;
       if (str.substring(str.length()-2 ).equals("ly"))return true;
       return false;

    }

/*
    Данная строка и целое число n. Вернуть строку, состоящую из первых и последних n символов исходной строки. Длина строки будет не меньше n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
 */

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);

    }
/*
    Данную строку и индекс. Вернуть строку длиной 2 символа, начинающуюся с указанного индекса.
    Если индекс слишком велик или слишком мал для определения строки длиной 2 символа, использовать первые 2 символа. Длина строки будет не менее 2 символов.

    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"

*/

    public String twoChar(String str, int index) {
        if( index < 0 || index > str.length() - 2 ) return str.substring(0,2);
        return str.substring(index , index + 2 );

    }

/*
    Дана строка нечётной длины. Верните строку длиной 3 символа, начиная с середины, например, из строки «Candy» получится «and». Длина строки будет не меньше 3 символов.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"

 */
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }


/*
    Для заданной строки верните true, если в строке есть «bad», начиная с индекса 0 или 1, например «badxxx» или «xbadxx», но не «xxbadxx». Строка может быть любой длины, включая 0.
    Примечание: для сравнения двух строк используйте .equals().

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false

 */
    public boolean hasBad(String str) {
        if (str == null || str.length() < 3) return false;
        if (str.substring(0, 3).equals("bad")) return true;
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) return true;
        return false;
    }





/*
    Данную строку нужно преобразовать в строку длиной 2 символа, состоящую из первых 2 символов исходной строки.
    Если длина строки меньше 2, используйте '@' для недостающих символов.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"

 */


    public String atFirst(String str) {
        System.out.println(str.length() < 2);
        if (str == null || str.trim().isEmpty()) return "@@";
        if (str.length() < 2  ) return str.substring(0) + "@";

        return  str.substring(0,2);
    }

}
