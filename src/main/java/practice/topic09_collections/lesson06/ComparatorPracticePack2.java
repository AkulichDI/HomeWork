package practice.topic09_collections.lesson06;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorPracticePack2 {

    // ===================== TASKS =====================

    /**
     * TASK A1: normalizeAndSortByWordCountThenAlphaCI
     *
     * Вход: List<String> lines
     *
     * Нужно вернуть НОВЫЙ List<String>, полученный по правилам:
     * 1) Если lines == null -> вернуть пустой список []
     * 2) Удалить элементы null
     * 3) Нормализовать каждую строку:
     *    - trim()
     *    - заменить подряд идущие пробелы на один пробел
     *      пример: "  a   b  " -> "a b"
     * 4) Если после нормализации строка пустая/blank -> удалить
     * 5) Отсортировать:
     *    - 1-й ключ: количество слов (по возрастанию)
     *      слово = часть строки, разделённая пробелом
     *    - 2-й ключ: алфавит A..Z без учёта регистра (case-insensitive)
     * 6) Вернуть список НОРМАЛИЗОВАННЫХ строк
     * 7) Исходный список не менять
     *
     * Пример:
     * ["  hello   world  ", "a", "  ", null, "Java  streams"]
     * -> ["a", "hello world", "Java streams"]
     */
    public static List<String> a1(List<String> lines) {

        if ( lines == null ) return new ArrayList<>();

        return lines.stream()
                .filter(Objects::nonNull)
                .map(el -> el.trim().replaceAll("\\s+", " " ))
                .filter(el -> !el.isBlank())
                .sorted( Comparator.comparingInt(( String el) -> el.split(" ").length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

    /**
     * TASK A2: sortIntsByAbsThenValueAsc
     *
     * Вход: List<Integer> nums
     *
     * Нужно вернуть НОВЫЙ List<Integer>:
     * 1) nums == null -> []
     * 2) null элементы удалить
     * 3) Отсортировать:
     *    - 1-й ключ: abs(x) по возрастанию
     *    - 2-й ключ: при равном abs(x) — само число по возрастанию
     *      пример: -3 раньше 3
     * 4) Исходный список не менять
     *
     * Пример:
     * [3, -1, -3, 2, null, -2] -> [-1, -2, 2, -3, 3]
     */
    public static List<Integer> a2(List<Integer> nums) {
        // TODO
        return new ArrayList<>();
    }

    /**
     * TASK A3: stableSortTasksByPriorityDesc
     *
     * Вход: List<Task>
     *
     * Нужно вернуть НОВЫЙ List<Task>:
     * 1) tasks == null -> []
     * 2) null элементы удалить
     * 3) Сортировка ТОЛЬКО по priority по убыванию
     * 4) ВАЖНО: если priority одинаковый, порядок должен остаться
     *    как в исходном списке (стабильная сортировка)
     * 5) Исходный список не менять
     */
    public static List<Task> a3(List<Task> tasks) {
        // TODO
        return new ArrayList<>();
    }

    /**
     * TASK A4: sortEntriesByValueDescThenKeyDescNullAsMinus1
     *
     * Вход: Map<String, Integer> map
     *
     * Нужно вернуть НОВЫЙ List<Map.Entry<String,Integer>>:
     * 1) map == null -> []
     * 2) value == null считать как -1
     * 3) Отсортировать записи:
     *    - 1-й ключ: value по убыванию
     *    - 2-й ключ: key по убыванию (Z..A)
     * 4) Исходную map не менять
     */
    public static List<Map.Entry<String, Integer>> a4(Map<String, Integer> map) {
        // TODO
        return new ArrayList<>();
    }

    /**
     * TASK A5: sortUsersByRatingDescThenLastNameCIThenFirstNameCI
     *
     * Вход: List<User>
     *
     * Нужно вернуть НОВЫЙ List<User>:
     * 1) users == null -> []
     * 2) null элементы удалить
     * 3) Удалить пользователей, у которых firstName или lastName:
     *    - null, или
     *    - blank после trim()
     * 4) rating может быть null: считать null как 0
     * 5) Отсортировать:
     *    - 1-й ключ: rating по убыванию (null как 0)
     *    - 2-й ключ: lastName (case-insensitive) по возрастанию
     *    - 3-й ключ: firstName (case-insensitive) по возрастанию
     * 6) В сортировке использовать trim() для имён/фамилий,
     *    но сами объекты User не изменять
     */
    public static List<User> a5(List<User> users) {
        // TODO
        return new ArrayList<>();
    }

    // ===================== MODELS =====================

    public static class Task {
        private final String title;
        private final int priority;

        public Task(String title, int priority) {
            this.title = title;
            this.priority = priority;
        }

        public String getTitle() { return title; }
        public int getPriority() { return priority; }

        @Override
        public String toString() {
            return "Task{" + "title='" + title + '\'' + ", priority=" + priority + '}';
        }
    }

    public static class User {
        private final String firstName;
        private final String lastName;
        private final Integer rating;

        public User(String firstName, String lastName, Integer rating) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.rating = rating;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }
        public Integer getRating() { return rating; }

        @Override
        public String toString() {
            return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", rating=" + rating + '}';
        }
    }
}
