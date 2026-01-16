package CodingBat.warmup1;

public class Front3 {

   /*
    * Если дана строка, то мы скажем, что начало — это первые 3 символа строки.
    * Если длина строки меньше 3 символов, то началом будет то, что есть.
    * Верните новую строку, состоящую из 3 копий начала.
    * front3("Java") → "JavJavJav"
    * front3("Chocolate") → "ChoChoCho"
    * front3("abc") → "abcabcabc"
    */


    public String front3(String str) {

        if (str == null) {
            throw new IllegalArgumentException("str must not be null");
        }

        String front = str.length() < 3 ? str : str.substring(0, 3);

        StringBuilder sb = new StringBuilder(front.length() * 3);
        for (int i = 0; i < 3; i++) {
            sb.append(front);
        }
        return sb.toString();
    }



}
