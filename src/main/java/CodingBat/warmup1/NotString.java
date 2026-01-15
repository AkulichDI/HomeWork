package CodingBat.warmup1;

public class NotString {


   /*
    * Для заданной строки верните новую строку, в начало которой добавлено "not".
    * Однако, еслиесли строка уже начинается с "not", верните строку без изменений.
    * Примечание: используйте .equals() для сравнения двух строк.
    * notString("candy") → "не конфета"
    * ("x") → "не x"
    * notString("неплохо") → "неплохо"
    */


    public String notString(String str) {
        if (str == null || str.trim().isEmpty()) throw new IllegalArgumentException("Пустая строка");
        String result = str.trim();

        if ( result.split("\\s")[0].equals("not")) {
            return result;
        }else {
            return  "not " + result;
        }
    }



}
