package CodingBat.warmup1;

public class MissingChar {

   /*
    * Данная непустая строка и целое число n.
    * Вернуть новую строку, в которой символ по индексу n удалён.
    * Значение n будет допустимым индексом символа в исходной строке (т. е. n будет находиться в диапазоне от 0 до str.length()-1 включительно).
    * missingChar("kitten", 1) → "ktten"
    * missingChar("kitten", 0) → "itten"
    * missingChar("kitten", 4) → "kittn"
    */


    public String missingChar(String str, int n) {
        StringBuilder result = new StringBuilder();

        for ( int i = 0 ; i <= str.length()-1; i++){
            if (i == n ) continue;
            result.append(str.toCharArray()[i]);
        }
        return result.toString();
    }

}
