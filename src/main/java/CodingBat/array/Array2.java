package CodingBat.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

import static java.util.List.of;

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
/*
    Для массива из 1 или более целых чисел верните разницу между наибольшим и наименьшим значениями в массиве.
    Примечание: встроенные методы Math.min(v1, v2) и Math.max(v1, v2) возвращают меньшее или большее из двух значений.

    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8
 */

    public int bigDiff(int[] nums) {
        if ( nums.length < 2 ) return 0;
        if ( nums.length == 2 ) return Math.abs(nums[0] - nums[1]);
        int max = nums[0];
        int min = nums[1];
        min = Math.min(max, min);
        max = Math.max(max, min);
        for (int i = 1; i < nums.length ;  i++) {
            min = Math.min(nums[i], min);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }

/*
    Верните «центрированное» среднее арифметическое массива целых чисел, которое, как мы будем называть,
    представляет собой среднее арифметическое значений, за исключением самых больших и самых маленьких значений в массиве.
    Если в массиве есть несколько одинаковых самых маленьких значений, игнорируйте только одно из них, и так же поступите с самыми большими значениями.
    Для получения окончательного среднего арифметического используйте деление целых чисел. Можно предположить, что длина массива составляет 3 или более элементов.

    centeredAverage([1, 2, 3, 4, 100]) → 3
    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */

    public int centeredAverage(int[] nums) {
        int min = nums[0], max = nums[0], sum = 0;

        for (int x : nums) {
            sum += x;
            if (x < min) min = x;
            if (x > max) max = x;
        }

        return (sum - min - max) / (nums.length - 2);
    }

/*
    Верните сумму чисел в массиве, а для пустого массива верните 0.
    Число 13 считается несчастливым, поэтому оно не учитывается, как и числа, идущие сразу после 13.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
 */
    public int sum13(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

}
