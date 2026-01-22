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

    /*
    Для заданного массива целых чисел верните true, если длина массива равна 1 или больше, а первый и последний элементы равны.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
     */

    public boolean sameFirstLast(int[] nums) {
        if ( nums.length >= 1 && nums[0] == nums[nums.length - 1 ] ) return true;
        return false;
    }

/*
    Верните массив int длиной 3, содержащий первые 3 цифры числа пи: {3, 1, 4}.
    makePi() → [3, 1, 4]

 */

    public int[] makePi() {

        return new int[]{3,1,4};

    }









}
