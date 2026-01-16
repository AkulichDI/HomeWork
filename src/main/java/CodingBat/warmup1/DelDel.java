package CodingBat.warmup1;

public class DelDel {

    /*
        Если в строке, начиная с индекса 1, встречается строка «del», верните строку, в которой эта «del» удалена. В противном случае верните строку без изменений.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"

     */


    public String delDel(String str) {

        if (str.startsWith("del", 1)) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }


}
