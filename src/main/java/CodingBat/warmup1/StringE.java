package CodingBat.warmup1;

public class StringE {


/*

    Верните значение true, если заданная строка содержит от 1 до 3 символов 'e'.


    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false

*/

    public boolean stringE(String str) {
        byte counter = 0;
        for ( Character el : str.toCharArray() ){
            if (el.equals('e')) counter++;
        }
        if (counter <= 3 && counter >= 1 ) return true;
        return false;

    }


}
