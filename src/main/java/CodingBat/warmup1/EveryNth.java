package CodingBat.warmup1;

public class EveryNth {


/*
    Данная непустая строка и целое число N. Вернуть строку, начинающуюся с символа 0, а затем с каждого N-го символа строки.
    То есть, если N равно 3, используйте символы 0, 3, 6, ... и так далее.
    N равно 1 или больше.


    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
*/


    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length();  i +=n) {
            result += str.toCharArray()[i];
        }

        return result;
    }
}
