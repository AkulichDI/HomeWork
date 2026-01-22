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


}
