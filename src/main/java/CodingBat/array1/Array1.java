package CodingBat.array1;

public class Array1 {

    /*

    Дан массив целых чисел. Верните true, если 6 является первым или последним элементом массива. Длина массива должна быть равна 1 или больше.


    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
     */

    public boolean firstLast6(int[] nums) {

        if ( nums[0] == 6 || nums[nums.length-1] == 6) return true;
        return false;
    }









}
