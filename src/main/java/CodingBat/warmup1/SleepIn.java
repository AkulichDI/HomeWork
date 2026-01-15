package CodingBat.warmup1;

public class SleepIn {
   /*
    * Параметр weekday имеет значение true, если сегодня будний день, а параметр vacation имеет значение true, если мы в отпуске.
    * Мы спим, если сегодня не будний день или мы в отпуске. Возвращаем true, если мы спим.
    * sleepIn(false, false) → true
    * sleepIn(true, false) → false
    * sleepIn(false, true) → true
    */



    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

}
