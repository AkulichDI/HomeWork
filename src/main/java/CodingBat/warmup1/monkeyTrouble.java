package CodingBat.warmup1;

public class monkeyTrouble {

    /*
    * У нас есть две обезьянки, a и b, и параметры aSmile и bSmile показывают, улыбается ли каждая из них.
    * У нас проблемы, если они обе улыбаются или если ни одна из них не улыбается.
    * Верните true, если у нас проблемы.
    * monkeyTrouble(true, true) → true
    * monkeyTrouble(false, false) → true
    * monkeyTrouble(true, false) → false
    */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ( aSmile && bSmile || !aSmile && !bSmile ) return true;
        return false;
    }
}
