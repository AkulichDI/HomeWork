package CodingBat.warmup1;

public class StartOz {

        /*
        Для заданной строки верните строку, состоящую из первых двух символов (если они есть), но включайте первый символ только в том случае,
        если он равен 'o', а второй — только в том случае, если он равен 'z'.
        Таким образом, из "ozymandias" получится "oz".

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
         */

    public String startOz(String str) {

        String result = "";

        if ( str.startsWith("o", 0) ){
            result += "o";
        }
        if (str.startsWith("z",1)){
            result+= "z";
        }
        return result;

    }

}
