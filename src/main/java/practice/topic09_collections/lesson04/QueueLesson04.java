package practice.topic09_collections.lesson04;

import java.util.*;

public class QueueLesson04 {

    /**
     * ЗАДАЧА 4.1: processQueue
     *
     * Есть очередь заявок (Queue<String>).
     * Нужно обработать первые k заявок:
     * - извлекать через poll()
     * - каждый обработанный элемент добавить в result (в том же порядке)

     * Правила:
     * - queue == null -> IllegalArgumentException("queue == null")
     * - k < 0 -> IllegalArgumentException("k < 0")
     * - если очередь закончилась раньше k -> просто остановиться
     * - null/blank заявки пропускать (trim + isBlank), но всё равно удалять из очереди

     * Вернуть: список обработанных заявок (уже trim).
     */
    public static List<String> processQueue(Queue<String> queue, int k) {

        if (queue == null )throw new IllegalArgumentException("queue == null");

        if ( k < 0 ) throw new IllegalArgumentException("K < 0");

        List<String> result = new ArrayList<>();

        int counter = k;

        while (counter > 0 && !queue.isEmpty()){

            String el = queue.poll();
            if (el == null || el.trim().isBlank()) {
                counter--;
                continue;
            }

            result.add(el.trim());
            counter--;
        }
        return result;
    }

    /**
     * ЗАДАЧА 4.2: reverseQueueCopy
     *
     * Вернуть НОВУЮ очередь с элементами в обратном порядке.
     * Исходную очередь НЕ менять.
     *
     * Правила:
     * - queue == null -> пустая очередь
     * - null элементы пропускать
     *
     * Подсказка: Stack (Deque) или List + reverse.
     */
    public static Queue<Integer> reverseQueueCopy(Queue<Integer> queue) {

        if (queue == null) return new ArrayDeque<>();

        List<Integer> result = new ArrayList<>(queue);
        result.removeIf(Objects::isNull);
        Collections.reverse(result);

        return new ArrayDeque<>(result);
    }

    /**
     * ЗАДАЧА 4.3: mergeAlternating
     *
     * Даны две очереди a и b. Вернуть НОВУЮ очередь, где элементы идут по очереди:
     * a1, b1, a2, b2, ...
     *
     * Правила:
     * - если a == null -> считать пустой
     * - если b == null -> считать пустой
     * - исходные очереди НЕ менять
     *
     * Пример:
     * a=[1,2,3], b=[10,20] -> [1,10,2,20,3]
     */
    public static Queue<Integer> mergeAlternating(Queue<Integer> a, Queue<Integer> b) {
        // TODO
        return new ArrayDeque<>();
    }

    /**
     * ЗАДАЧА 4.4: isPalindromeQueue
     *
     * Очередь символов. Нужно проверить, является ли она палиндромом.
     * Исходную очередь НЕ менять.
     *
     * Правила:
     * - queue == null -> false
     * - null символы игнорировать
     * - сравнение без учёта регистра (Character.toLowerCase)
     *
     * Подсказка: собрать в List<Character> и использовать два указателя.
     */
    public static boolean isPalindromeQueue(Queue<Character> queue) {
        // TODO
        return false;
    }

    /**
     * ЗАДАЧА 4.5: recentUnique
     *
     * Реализуй "историю" последних уникальных действий размером limit.
     * Возвращает список действий, где:
     * - порядок: от самого старого к самому новому
     * - действия уникальны (если действие повторилось — старое удалить, новое добавить в конец)
     * - размер не больше limit (если переполнено — удалить самое старое)
     *
     * Правила:
     * - actions == null -> пустой список
     * - limit <= 0 -> пустой список
     * - null/blank игнорировать
     * - все строки в результате trim
     *
     * Пример:
     * actions=[" a ","b","a","c","b"], limit=3
     * шаги:
     *  a -> [a]
     *  b -> [a,b]
     *  a -> [b,a]
     *  c -> [b,a,c]
     *  b -> [a,c,b]   (b повторился)
     * результат: [a,c,b]
     *
     * Подсказка: LinkedList + Set (или LinkedHashSet, но там надо аккуратно с порядком).
     */
    public static List<String> recentUnique(List<String> actions, int limit) {
        // TODO
        return List.of();
    }

}
