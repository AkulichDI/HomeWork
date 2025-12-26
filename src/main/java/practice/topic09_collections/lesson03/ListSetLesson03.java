package practice.topic09_collections.lesson03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetLesson03 {

    /**
     * ЗАДАЧА 3.1: firstDuplicate(List<String> items)
     *
     * Вернуть первый элемент, который встречается ВТОРОЙ раз.
     * Пример: [a, b, c, b, a] -> "b"
     *
     * Правила:
     * - items == null -> null
     * - null / blank игнорировать (trim + isBlank)
     * - сравнение по equals()
     * - если дублей нет -> null
     *
     */
    public static String firstDuplicate(List<String> items) {
        if (items == null ) return null;
        Set<String> result = new HashSet<>(items.size());
        for(String el : items){
            if ( el == null || el.trim().isBlank()) continue;
            if(result.contains(el.trim()))return el;
            result.add(el.trim());
        }
        return null;
    }

    /**
     * ЗАДАЧА 3.2: uniqueCount(List<String> items)
     *
     * Вернуть количество уникальных элементов.
     * Пример: [a, b, a, c, b] -> 3
     *
     * Правила:
     * - items == null -> 0
     * - null / blank игнорировать
     *
     */
    public static int uniqueCount(List<String> items) {

        Set<String> result = new HashSet<>(items);

        return result.size();
    }

    /**
     * ЗАДАЧА 3.3: intersection(List<String> a, List<String> b)
     *
     * Вернуть список уникальных общих элементов (пересечение),
     * в порядке первого появления в списке a.
     *
     * Пример:
     * a=[a, b, a, c], b=[c, a, x] -> [a, c]
     *
     * Правила:
     * - если a == null или b == null -> пустой список
     * - null / blank игнорировать
     * - результат без дублей
     *
     * Подсказка:
     * - сделай Set из b (быстрый contains)
     * - сделай LinkedHashSet для результата (чтобы порядок a сохранился)
     */
    public static List<String> intersection(List<String> a, List<String> b) {
        // TODO
        return List.of();
    }

    /**
     * ЗАДАЧА 3.4: difference(List<String> a, List<String> b)
     *
     * Вернуть элементы, которые есть в a, но НЕТ в b (разность),
     * уникально и в порядке первого появления в a.
     *
     * Пример:
     * a=[a, b, a, c], b=[b] -> [a, c]
     *
     * Правила:
     * - если a == null -> пустой список
     * - если b == null -> вернуть уникальные элементы a (в порядке)
     * - null / blank игнорировать
     * - результат без дублей
     */
    public static List<String> difference(List<String> a, List<String> b) {
        // TODO
        return List.of();
    }

    /**
     * ЗАДАЧА 3.5: hasAllUnique(List<String> items)
     *
     * Вернуть true, если в items нет дублей (все уникальные).
     *
     * Пример:
     * [a, b, c] -> true
     * [a, b, a] -> false
     *
     * Правила:
     * - items == null -> true
     * - null / blank игнорировать
     *
     * Подсказка: сравнить count валидных элементов и размер Set.
     */
    public static boolean hasAllUnique(List<String> items) {
        // TODO
        return false;
    }

}
