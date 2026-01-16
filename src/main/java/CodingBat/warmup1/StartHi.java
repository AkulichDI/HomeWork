package CodingBat.warmup1;

public class StartHi {


    /**
    Для заданной строки верните true, если строка начинается с «hi», и false в противном случае.
     startHi("hi there") → true
     startHi("hi") → true
     startHi("hello hi") → false
    **/

    public boolean startHi(String str) {

        if ( str.length() >= 2 ){
            return str.substring(0,2).equals("hi");
        }
        return false;
    }


}
