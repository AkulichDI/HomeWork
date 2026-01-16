package CodingBat.warmup1;

public class BackAround {

   /*
    * Дана строка. Возьмите последний символ и верните новую строку, в которой последний символ добавлен в начало и конец, то есть из "cat" получится "tcatt".
    * Исходная строка должна иметь длину 1 или больше.
    * backAround("cat") → "tcatt"
    * backAround("Hello") → "oHelloo"
    * backAround("a") → "aaa"
    */



    public String backAround(String str) {

        Character lasChar = str.charAt(str.length()- 1);
        return lasChar + str + lasChar;

    }

}
