package practice.topic02_arrays;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ArrayTasks {

    public static void validatorArrayInt(int[] arr){
        if (arr == null) throw new IllegalArgumentException("Массив null");
        if (arr.length == 0) throw new IllegalArgumentException("Пустой массив");
    }


    public static int max(int[] a) {
       ArrayTasks.validatorArrayInt(a);
       int current = a[0];
        for (int i = 1; i < a.length; i++) {
            if (current < a[i]) current = a[i];
        }
        return current;
    }
    public static int[] rotateRight(int[] a, int k) {
        ArrayTasks.validatorArrayInt(a);
        int[] result = new int[a.length];
        k = k % a.length;
        for (int i = 0; i < a.length; i++) {
           int newIndex = (i + k) % a.length;
           result[newIndex] = a[i];
        }



       return result;
    }







    public static void main(String[] args) {
        int[] a = {10,23,33,43,54,65,76,87,98,56,45,43,65,767,8787,87878,32423,324234,2234234};
        System.out.println(ArrayTasks.max(a));
    }

}
