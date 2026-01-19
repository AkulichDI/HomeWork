package CodingBat.warmup1;

public class LastDigit {

/*
    Для двух неотрицательных целых чисел верните true, если у них одинаковая последняя цифра, например у 27 и 57.
    Обратите внимание, что оператор % «остаток от деления» вычисляет остаток, поэтому 17 % 10 равно 7.
    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
*/


    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }



}
