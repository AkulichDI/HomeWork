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

/*
    Вы и ваша пара пытаетесь найти столик в ресторане.
    Параметр "you" - это стильность вашей одежды в диапазоне 0..10, а "date" - это стильность одежды вашего кавалера.
    Результат, получаемый в таблице, кодируется как значение int с 0 = нет, 1 = возможно, 2 = да.
    Если кто-то из вас очень стильный, 8 или более, то результат равен 2 (да).
    За исключением случаев, когда у одного из вас стиль 2 или ниже, тогда результат будет 0 (нет).
    В остальных случаях результат будет 1 (возможно).

    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
*/
    public int dateFashion(int you, int date) {

        if ( (you >= 8 && date > 2 ) || (date >= 8 && you > 2)) return 2;

        if ( you <= 2 || date <= 2 ) return 0;

        return 1;

    }

/*

    Белки в Пало-Альто проводят большую часть дня за играми.
    В частности, они играют, если температура находится в диапазоне от 60 до 90 градусов (включительно).
    Если только не лето, то верхний предел составляет 100 градусов, а не 90.
    Учитывая целочисленное значение температуры и логическое значение isSummer, верните true, если белки играют, и false в противном случае.

    squirrelPlay(70, false) → true
    squirrelPlay(95, false) → false
    squirrelPlay(95, true) → true
 */
    public boolean squirrelPlay(int temp, boolean isSummer) {

        if ( (temp >= 60 && temp <= 90 && isSummer == false) || ( temp >= 60 && temp <= 100 && isSummer == true) ) return true;

        return false;

    }


/*
    Вы едете слишком быстро, и вас останавливает полицейский.
    Напишите код для вычисления результата в виде целого числа: 0 — без штрафа, 1 — небольшой штраф, 2 — крупный штраф.
    Если скорость составляет 60 км/ч или меньше, результат будет равен 0.
    Если скорость составляет от 61 до 80 км/ч включительно, результат будет равен 1.
    Если скорость составляет 81 км/ч или больше, результат будет равен 2.
    Если только это не ваш день рождения — в этот день ваша скорость во всех случаях может быть на 5 % выше.

    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0
*/

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if ( speed <= 60 || ( isBirthday == true && speed <= 65 ) ) return 0;

        if ( speed >= 61 && speed <= 80  || ( isBirthday == true && speed <= 85 ) )  return 1;

        return 2;
    }


}
