package CodingBat.warmup1;

public class EndUp {

/*
    Для заданной строки верните новую строку, в которой последние 3 символа будут в верхнем регистре.
    Если в строке меньше 3 символов, используйте верхний регистр для всех символов. Обратите внимание, что str.toUpperCase() возвращает строку в верхнем регистре.
    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
*/



    public String endUp(String str) {

        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);

        return front + back.toUpperCase();
    }

}
