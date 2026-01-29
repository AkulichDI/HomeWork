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

/*
    Даны два целых числа, a и b.
    Верните их сумму.
    Однако суммы в диапазоне от 10 до 19 включительно запрещены, поэтому в этом случае просто верните 20.


    sortaSum(3, 4) → 7
    sortaSum(9, 4) → 20
    sortaSum(10, 11) → 21
*/

    public int sortaSum(int a, int b) {

        if ( a + b  >= 10 && a + b <= 19 )return 20;

        return a + b;

    }

/*

    Учитывая день недели, закодированный как 0 = вс, 1 = пн, 2 = вт, ... 6 = сб, и логическое значение, указывающее,
    находимся ли мы в отпуске, верните строку вида "7:00", указывающую, когда должен прозвенеть будильник.
    В будние дни будильник должен звонить в 7:00, а в выходные — в 10:00.
    Если только мы не в отпуске — тогда в будние дни должно быть указано «10:00», а в выходные — «выходной».

    alarmClock(1, false) → «7:00»
    alarmClock(5, false) → «7:00»
    alarmClock(0, false) → «10:00»
*/

    public String alarmClock(int day, boolean vacation) {

        if ( ( day == 0 || day == 6 ) && vacation == true) return "off";

        if ( day == 0 || day == 6 ) return "10:00";

        if ( vacation == true ) return "10:00";
        return "7:00";

    }

/*
    Число 6 — поистине великое число.
    Для двух целых чисел a и b верните true, если одно из них равно 6. Или если их сумма или разность равна 6.
    Примечание: функция Math.abs(num) вычисляет абсолютное значение числа.
    love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true
*/

    public boolean love6(int a, int b) {

        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;

    }


/*
    Для заданного числа n верните true, если n находится в диапазоне от 1 до 10 включительно.
    Если только outsideMode не равен true, в этом случае верните true, если число меньше или равно 1 или больше или равно 10.

    in1To10(5, false) → true
    in1To10(11, false) → false
    in1To10(11, true) → true
 */

    public boolean in1To10(int n, boolean outsideMode) {

        if (!outsideMode) {
            return n >= 1 && n <= 10;
        } else {
            return n <= 1 || n >= 10;
        }
    }

/*
    Число называется особым, если оно кратно 11 или если оно на единицу больше числа, кратного 11.
    Верните true, если заданное неотрицательное число является особым.
    Используйте оператор % «остаток от деления» — см.
    Введение в модуль

    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
 */



    public boolean specialEleven(int n) {

        if ( n % 11 == 0 || (n - 1) % 11 == 0  ) return true;

        return false;

    }

/*
    Верните true, если заданное неотрицательное число на 1 или 2 больше числа, кратного 20.
    См. также: Введение в Mod

    more20(20) → false
    more20(21) → true
    more20(22) → true
 */

    public boolean more20(int n) {

        if ( n > 0 && (( ( n -1  ) % 20 == 0 ) || ( n - 2  ) % 20 == 0 ) )return true;
        return false;

    }


/*
    Верните true, если заданное неотрицательное число кратно 3 или 5, но не кратно обоим числам.
    Используйте оператор % «остаток от деления» — см. Введение в модуль

    old35(3) → true
    old35(10) → true
    old35(15) → false
 */

    public boolean old35(int n) {

        if ( n > 0  && ( n % 3 == 0 || n % 5 == 0  ) && ((n % 3 == 0) ^ (n % 5 == 0)) )return true;
        return false;
    }

/*
    Возвращает true, если заданное неотрицательное число на 1 или 2 меньше кратного 20.
    Например, 38 и 39 возвращают true, а 40 — false.

    less20(18) → true
    less20(19) → true
    less20(20) → false
*/
    public boolean less20(int n) {

        if ( n > 0 && ( (n + 1 ) % 20 == 0 || ( n + 2 ) % 20 == 0 ) ) return true;
        return false;

    }

/*
    Для заданного неотрицательного числа "num" верните true, если num находится в пределах 2 от числа, кратного 10.
    Примечание: (a % b) — это остаток от деления a на b, поэтому (7 % 5) равно 2. См. также: Введение в Mod

    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
 */

    public boolean nearTen(int num) {

        if ( num > 0 && ( ( num - 2 ) % 10 == 0 || ( num + 2 ) % 10 == 0 ) || ( num - 1 ) % 10 == 0 || ( num + 1 ) % 10 == 0 || num % 10 == 0 )return true;
        return false;

    }
/*
    Даны два целых числа, a и b. Верните их сумму. Однако значения «от 13 до 19» включительно являются особенно удачными.
    Поэтому, если одно из чисел находится в этом диапазоне, просто верните 19.

    teenSum(3, 4) → 7
    teenSum(10, 13) → 19
    teenSum(13, 2) → 19
*/
    public int teenSum(int a, int b) {

        if ( ( a >=13 && a <= 19 ) || ( b >=13 && b <= 19 ) ) return 19;
        if ( a + b >= 13 && a + b <= 19 ) return a + b;
        return a + b;

    }

/*
    У вас звонит мобильный. Верните true, если вам следует ответить.
    Обычно вы отвечаете, но по утрам отвечаете только в том случае, если звонит ваша мама.
    Во всех случаях, если вы спите, вы не отвечаете.

    answerCell(false, false, false) → true
    answerCell(false, false, true) → false
    answerCell(true, false, false) → false
 */

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning) return isMom;
        return true;

    }

/*
    Мы устраиваем вечеринку с определённым количеством чая и конфет.
    Верните целочисленный результат вечеринки, где 0 — плохо, 1 — хорошо, а 2 — отлично.
    Вечеринка хороша (1), если и чая, и конфет не меньше 5.
    Однако если количество чая или конфет как минимум в два раза больше количества другого продукта, вечеринка отличная (2).
    Но во всех случаях, если количество чая или конфет меньше 5, вечеринка всегда плохая (0).

    teaParty(6, 8) → 1
    teaParty(3, 8) → 0
    teaParty(20, 6) → 2
 */

    public int teaParty(int tea, int candy) {

        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;

    }

/*
    Если строка str начинается с "f", верните "Fizz". Если строка заканчивается на "b", верните "Buzz".
    Если выполняются оба условия "f" и "b", верните "FizzBuzz". Во всех остальных случаях верните строку без изменений. (См. также: Код FizzBuzz)

    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
*/

    public String fizzString(String str) {

        if ( str.substring(0,1).equalsIgnoreCase("f") &&  str.substring(str.length()-1 ).equalsIgnoreCase("b")) return "FizzBuzz";
        if ( str.substring(0,1).equalsIgnoreCase("f") )return "Fizz";
        if ( str.substring(str.length()-1 ).equalsIgnoreCase("b")) return "Buzz";

        return  str;

    }

/*
    Для заданного целого числа n верните строковую форму числа, за которой следует "!".
    Например, для целого числа 6 получится "6!".
    За исключением случаев, когда число делится на 3, вместо числа используйте "Fizz",
    а если число делится на 5, используйте "Buzz", а если число делится и на 3, и на 5, используйте "FizzBuzz".
    Примечание: оператор % «остаток от деления» вычисляет остаток после деления, поэтому 23 % 10 равно 3. Каким будет остаток,
    если одно число делится на другое без остатка?

    fizzString2(1) → "1!"
    fizzString2(2) → "2!"
    fizzString2(3) → "Fizz!"
*/

    public String fizzString2(int n) {

        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz) return "FizzBuzz!";
        if (fizz) return "Fizz!";
        if (buzz) return "Buzz!";
        return n + "!";


    }

/*
    Даны три целых числа: a, b и c.
    Верните true, если из двух целых чисел можно получить третье, сложив их.

    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false
 */

    public boolean twoAsOne(int a, int b, int c) {

        return a + b == c || a + c == b || c + b == a;


    }


}
