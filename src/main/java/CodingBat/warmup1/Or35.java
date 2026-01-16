package CodingBat.warmup1;

public class Or35 {

    /**
     Возвращает true, если заданное неотрицательное число кратно 3 или 5.
     Используйте оператор % «остаток от деления» — см. Введение в модуль
     or35(3) → true
     or35(10) → true
     or35(8) → false
     **/



    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

}
