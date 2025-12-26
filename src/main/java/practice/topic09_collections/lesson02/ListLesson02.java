package practice.topic09_collections.lesson02;

import java.util.*;

import static java.util.Collections.reverse;

public class ListLesson02 {


        public static boolean validatorArr (Collection<?> a ){
            if (a == null) return true;
            return false;
        }
        public static boolean validatorString (String s){
            if (s == null || s.trim().isBlank()) return true;
            return false;
        }



        /**
         * ЗАДАЧА 2.1: secondMax(List<Integer> nums)
         *
         * Верни второй по величине элемент (второй максимум).
         * Правила:
         * - nums == null или size < 2 -> IllegalArgumentException("мало данных")
         * - null элементы игнорировать
         * - если после игнора null осталось < 2 чисел -> IllegalArgumentException("мало данных")
         * Пример: [5, 1, 5, 3] -> 5 (второй максимум тоже 5)
         */
        public static int secondMax(List<Integer> nums) {
           if (validatorArr(nums) || nums.size() < 2 ) throw new IllegalArgumentException("Мало данных");
           nums.removeIf(Objects::isNull);
           if (nums.size()< 2 ) throw new IllegalArgumentException("Мало данных");
           int bigInt = Integer.MIN_VALUE;
           int secondBigInt = Integer.MIN_VALUE;
           nums.removeIf(Objects::isNull);
           for ( int num : nums ){

               if ( num >= bigInt ){
                   secondBigInt = bigInt;
                   bigInt = num;
               }
               if(num > secondBigInt && num < bigInt){
                   secondBigInt = num;
               }
           }
            return secondBigInt;
        }

        /**
         * ЗАДАЧА 2.2: removeAtEvenIndexes(List<String> list)
         *
         * Удалить "на месте" элементы с чётными индексами: 0,2,4,...
         * Правила:
         * - list == null -> ничего не делать
         * Подсказка: удаляй с конца (иначе индексы съедут)
         */
        public static void removeAtEvenIndexes(List<String> list) {
            if (validatorArr(list)) throw new IllegalArgumentException("Пустой массив");
            if (list.size() == 1 ) throw new IllegalArgumentException("Массив состоит из одного элемента");

            for (int i = list.size()- 1; i >= 0; i--) {
                 if ( i % 2 == 0 ){
                     list.remove(i);
                 }
            }
        }

        /**
         * ЗАДАЧА 2.3: swap(List<?> list, int i, int j)
         *
         * Поменять местами элементы i и j.
         * Правила:
         * - list == null -> IllegalArgumentException("list == null")
         * - индексы должны быть в диапазоне, иначе IndexOutOfBoundsException (пусть кидается сама)
         */
        public static void swap(List<?> list, int i, int j) {
           if (validatorArr(list)) throw new IllegalArgumentException("List == null");
           if (i > list.size()- 1 || j > list.size() - 1 ) throw new IndexOutOfBoundsException("Индексы больше массива");
            Collections.swap(list,i,j);
        }

        /**
         * ЗАДАЧА 2.4: reverseCopy(List<String> list)
         *
         * Верни НОВЫЙ список в обратном порядке.
         * Правила:
         * - list == null -> пустой список
         * - элементы не менять
         */
        public static List<String> reverseCopy(List<String> list) {
            if (list == null ) return new ArrayList<>();
           List<String> result = new ArrayList<>(list);
           Collections.reverse(result);
            return result;
        }

        /**
         * ЗАДАЧА 2.5: toIntList(int[] a)
         *
         * Преобразовать массив int[] в List<Integer>.
         * Правила:
         * - a == null -> пустой список
         */
        public static List<Integer> toIntList(int[] a) {
            // TODO
            return List.of();
        }
    }




