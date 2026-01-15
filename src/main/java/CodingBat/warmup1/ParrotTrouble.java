package CodingBat.warmup1;

public class ParrotTrouble {

    /*
    * У нас есть говорящий попугай. Параметр «час» — это текущее время в диапазоне от 0 до 23.
    * У нас проблемы, если попугай говорит, а время меньше 7 или больше 20.
    * Верните true, если у нас проблемы.
    * parrotTrouble(true, 6) → true
    * parrotTrouble(true, 7) → false
    * parrotTrouble(false, 6) → false
    */


    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20) ? true : false;
    }

}
