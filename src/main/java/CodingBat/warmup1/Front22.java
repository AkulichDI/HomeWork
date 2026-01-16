package CodingBat.warmup1;

public class Front22 {

    /**
     Для заданной строки возьмите первые 2 символа и верните строку с этими 2 символами, добавленными в начало и в конец, то есть "kitten" превратится в "kikittenki".
     Если длина строки меньше 2, используйте любые имеющиеся символы.
     front22("kitten") → "kikittenki"
     front22("Ha") → "HaHaHa"
     front22("abc") → "ababcab"
     * **/


    public String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }

}
