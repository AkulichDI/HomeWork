package CodingBat.string1;

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

}
