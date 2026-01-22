package CodingBat.array1;

import java.util.Arrays;
import java.util.Collections;

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


/*
    Даны два массива целых чисел a и b.
    Верните true, если у них одинаковый первый элемент или одинаковый последний элемент.
    Оба массива будут иметь длину 1 или больше.

    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
 */

    public boolean commonEnd(int[] a, int[] b) {

       if ( a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;
       return false;

    }

    /*
    Дан массив целых чисел длиной 3. Верните сумму всех элементов.

    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
    */

    public int sum3(int[] nums) {
        int result = 0;
        for ( int el : nums){
            result += el;
        }
        return result;
    }

/*
    Дан массив целых чисел длиной 3. Верните массив, в котором элементы «повернуты влево», то есть {1, 2, 3} преобразуется в {2, 3, 1}.

    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */


    public int[] rotateLeft3(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = nums[i + 1];
        }
        result[nums.length - 1] = nums[0];
        return result;

    }

/*
    Дан массив целых чисел длиной 3. Верните новый массив с элементами в обратном порядке, то есть {1, 2, 3} станет {3, 2, 1}.

    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
*/

    public int[] reverse3(int[] nums) {

        int[] result = new int[nums.length];
        int counter= nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[counter--];
        }
        return result;

    }

/*
    Дан массив целых чисел длиной 3. Определите, какой элемент больше — первый или последний, — и присвойте этому значению все остальные элементы.
    Верните изменённый массив.

    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
*/



    public int[] maxEnd3(int[] nums) {
        int el = Math.max(nums[0], nums[nums.length -1 ]); ;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = el;
        }
        return result;
    }

/*
    Дан массив целых чисел. Верните сумму первых двух элементов массива. Если длина массива меньше 2, просто сложите имеющиеся элементы и верните 0, если длина массива равна 0.

    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
 */

    public int sum2(int[] nums) {
        if ( nums == null || nums.length == 0) return 0;
        if ( nums.length-1  < 1) return nums[0];

        return nums[0] + nums[1];

    }

/*

    Даны два массива целых чисел a и b длиной 3 каждый. Верните новый массив длиной 2, содержащий их средние элементы.


    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/

    public int[] middleWay(int[] a, int[] b) {

        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;

    }

/*
    Дан массив целых чисел. Верните новый массив длиной 2, содержащий первый и последний элементы исходного массива.
    Исходный массив будет иметь длину 1 или больше.

    makeEnds([1, 2, 3]) → [1, 3]
    makeEnds([1, 2, 3, 4]) → [1, 4]
    makeEnds([7, 4, 6, 2]) → [7, 2]
*/

    public int[] makeEnds(int[] nums) {

        return new int[] {nums[0], nums[nums.length - 1 ]};

    }

/*
    Дан массив int длиной 2. Верните true, если в нём есть число 2 или 3.

    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
 */

    public boolean has23(int[] nums) {

        for (int el : nums ){
            if (el == 2 || el == 3) return true;
        }
        return false;
    }

/*
    Для массива int длиной 2 верните true, если в нём нет чисел 2 или 3.

    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false
 */

    public boolean no23(int[] nums) {

        for (int el : nums ){
            if (el == 2 || el == 3) return false;
        }
        return true;
    }

/*
    Дан массив int. Верните новый массив с удвоенной длиной, в котором последний элемент совпадает с последним элементом исходного массива, а все остальные элементы равны 0.
    Исходный массив должен иметь длину 1 или больше.
    Примечание: по умолчанию новый массив int содержит только нули.

    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
*/

    public int[] makeLast(int[] nums) {

        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }



/*
    Дан массив целых чисел. Верните true, если в массиве дважды встречается число 2 или дважды встречается число 3.
    Длина массива может быть равна 0, 1 или 2.

    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
*/

    public boolean double23(int[] nums) {

        int counter2 = 0;
        int counter3 = 0;

        for (int el : nums){
            if ( el == 2 ) counter2++;
            if ( el == 3 ) counter3++;
        }

        if ( counter2 >= 2  ) return true;
        if ( counter3 >= 2  ) return true;

        return false;
    }

/*
    Дан массив int длиной 3. Если в массиве есть число 2, за которым сразу следует число 3, установите для элемента 3 значение 0. Верните изменённый массив.

    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
*/

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3) nums[2] = 0;
        return nums;
    }

/*
    Начните с двух массивов int, a и b, любой длины. Верните количество массивов, в которых 1 является первым элементом.

    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
 */

    public int start1(int[] a, int[] b) {
        int count = 0;

        if (a != null && a.length > 0 && a[0] == 1) count++;
        if (b != null && b.length > 0 && b[0] == 1) count++;

        return count;
    }

/*
    Дан массив целых чисел чётной длины. Верните новый массив длиной 2, содержащий два средних элемента исходного массива. Исходный массив должен иметь длину 2 или больше.

    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
*/

    public int[] makeMiddle(int[] nums) {

        return new int[] {nums[nums.length/2 - 1 ], nums[(nums.length/2)]};
    }

/*
    Даны 2 массива int длиной 2 каждый. Верните новый массив длиной 4, содержащий все их элементы.

    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
    public int[] plusTwo(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];
        int k = 0;

        for ( int x : a ) result[k++] = x;
        for ( int x : b ) result[k++] = x;

        return result;
    }

}
