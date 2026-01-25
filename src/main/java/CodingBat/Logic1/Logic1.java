package CodingBat.Logic1;

public class Logic1 {

/*
    Когда белки собираются на вечеринку, они любят покурить сигары.
    Вечеринка у белок проходит успешно, если количество сигар составляет от 40 до 60 включительно.
    Если только это не выходные, в этом случае количество сигар не ограничено.
    Верните true, если вечеринка с указанными значениями прошла успешно, и false в противном случае.

    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true
*/

    public boolean cigarParty(int cigars, boolean isWeekend) {

        if ( cigars >= 40 && cigars <= 60  ) return true;

        if ( cigars >= 40 && isWeekend == true) return true;

        return false;



    }



}
