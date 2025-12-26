package practice.topic09_collections.lesson01;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionLesson01 {

    /**
     * ЗАДАЧА 1: countNonNull
     * Верни количество НЕ-null элементов в коллекции.
     * Правила:
     * - items == null -> 0
     */
    public static int countNonNull(Collection<?> items) {
        if (items == null ) return 0;
        var counter = 0;
        for (var element : items) {
            if (element == null) continue;
            counter++;
        }
        return counter;
    }

    /**
     * ЗАДАЧА 2: filterEven
     * Верни новый List<Integer> только из чётных чисел (порядок сохранить).
     * Правила:
     * - nums == null -> пустой список
     * - null элементы пропускать
     */
    public static List<Integer> filterEven(Collection<Integer> nums) {
        if (nums == null )return new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (var element : nums){
            if (element != null && element % 2 == 0 ){
                arr.add(element);
            }
        }
        return arr;
    }

    /**
     * ЗАДАЧА 3: removeBlanksInPlace
     * Удалить "на месте" из items все элементы, которые:
     * - null
     * - или после trim пустые/blank
     * Правила:
     * - items == null -> ничего не делать
     */
    public static void removeBlanksInPlace(Collection<String> items) {
        Iterator<String> elements = items.iterator();
        while (elements.hasNext()){
            var el = elements.next();
            if (el == null || el.trim().isBlank()) elements.remove();

        }
    }

    /**
     * ЗАДАЧА 4: containsAny
     * Верни true, если у коллекций есть хотя бы один общий элемент.
     * Правила:
     * - если a == null или b == null -> false
     * - сравнение через equals()
     */
    public static boolean containsAny(Collection<String> a, Collection<String> b) {
        if (a == null || b == null) return false;

        Collection<String> small = a.size() <= b.size() ? a : b;
        Collection<String> big   = a.size() <= b.size() ? b : a;

        for (String x : small) {
            if (big.contains(x)) return true;
        }
        return false;
    }

    /**
     * ЗАДАЧА 5: uniqueInOrder
     * Верни список уникальных элементов в порядке первого появления.
     * Пример: [a, b, a, c, b] -> [a, b, c]
     * Правила:
     * - items == null -> пустой список
     * - null элементы пропускать
     * Подсказка: LinkedHashSet
     */
    public static List<String> uniqueInOrder(Collection<String> items) {
       if ( items == null ) return new ArrayList<>();
       Set<String> result = new LinkedHashSet<>();
       for (String element : items){
           if (element == null || element.trim().isBlank() )continue;
           result.add(element.trim());
       }
        return new ArrayList<>(result);
    }



}
