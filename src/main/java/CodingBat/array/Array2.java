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





}
