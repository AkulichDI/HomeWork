package CodingBat.array;

public class Array2 {

/*
    Возвращает количество четных целых чисел в заданном массиве.
    Примечание: оператор % "mod" вычисляет остаток, например, 5 % 2 равно 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
 */

    public int countEvens(int[] nums) {
        byte counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] % 2 == 0  )counter++;
        }
        return counter;
    }







}
