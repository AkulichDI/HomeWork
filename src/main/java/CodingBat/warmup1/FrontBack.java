package CodingBat.warmup1;

public class FrontBack {

    /*
    *Данную строку нужно преобразовать в новую, в которой первый и последний символы поменяются местами.
    * frontBack("code") → "eodc"
    * frontBack("a") → "a"
    * frontBack("ab") → "ba"
     */

    public String frontBack(String str) {
        if ( str.length() <= 1) return str;
        int sizeStr = str.length();
        StringBuilder result = new StringBuilder( sizeStr );
        result.append( str.charAt ( sizeStr-1 ) );
        result.append( str.substring ( 1, sizeStr-1 ) );
        result.append( str.charAt ( 0 ) );
        return result.toString();
    }



}
