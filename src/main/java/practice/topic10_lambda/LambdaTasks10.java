package practice.topic10_lambda;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaTasks10 {

    // ===================== MODELS =====================
    public static class User {
        private final String firstName;
        private final String lastName;
        private final int age;

        public User(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public String getFirstName() { return firstName; }
        public String getLastName()  { return lastName; }
        public int getAge()          { return age; }

        @Override public String toString() {
            return lastName + " " + firstName + " (" + age + ")";
        }
    }

    // ===================== TASKS =====================

    /**
     * TASK 1: predicateNonBlank
     *
     * Верни Predicate<String>, который true только если строка:
     * - не null
     * - после trim() НЕ blank
     *
     * Примеры:
     * null -> false
     * "   " -> false
     * " a " -> true
     */
    public static Predicate<String> predicateNonBlank() {
        // TODO
        return s -> false;
    }

    /**
     * TASK 2: functionNormalizeSpaces
     *
     * Верни Function<String,String>:
     * - если вход null -> вернуть null
     * - иначе trim()
     * - затем заменить подряд идущие пробельные символы "\\s+" на один пробел " "
     *
     * Пример:
     * "  a   b\tc " -> "a b c"
     */
    public static Function<String, String> functionNormalizeSpaces() {
        // TODO
        return s -> s;
    }

    /**
     * TASK 3: consumerWithPrefix
     *
     * Верни Consumer<String>, который печатает в консоль:
     * prefix + ": " + value
     *
     * Пример:
     * prefix="INFO", value="Start" -> "INFO: Start"
     */
    public static Consumer<String> consumerWithPrefix(String prefix) {
        // TODO
        return s -> {};
    }

    /**
     * TASK 4: supplierOfList
     *
     * Верни Supplier<List<String>>, который при вызове get()
     * возвращает новый (пустой) ArrayList<String>.
     */
    public static Supplier<List<String>> supplierOfList() {
        // TODO
        return ArrayList::new;
    }

    /**
     * TASK 5: safeDivide
     *
     * Верни BiFunction<Integer,Integer,Integer>:
     * - если a == null или b == null -> 0
     * - если b == 0 -> 0
     * - иначе вернуть a / b
     */
    public static BiFunction<Integer, Integer, Integer> safeDivide() {
        // TODO
        return (a, b) -> 0;
    }

    /**
     * TASK 6: combinePredicatesAnd
     *
     * Даны два Predicate<String> p1 и p2.
     * Верни Predicate<String>, который true только если p1 и p2 true (AND).
     * Если p1 или p2 == null, считать что оно всегда true.
     */
    public static Predicate<String> combinePredicatesAnd(Predicate<String> p1, Predicate<String> p2) {
        // TODO
        return s -> false;
    }

    /**
     * TASK 7: composeFunctions
     *
     * Даны Function<A,B> f и Function<B,C> g.
     * Верни Function<A,C>, который делает: g(f(a)).
     * Если f или g == null, бросить IllegalArgumentException.
     */
    public static <A, B, C> Function<A, C> composeFunctions(Function<A, B> f, Function<B, C> g) {
        // TODO
        return a -> null;
    }

    /**
     * TASK 8: comparatorUsers
     *
     * Верни Comparator<User>, который сортирует:
     * 1) lastName (case-insensitive) asc
     * 2) firstName (case-insensitive) asc
     * 3) age asc
     *
     * Правила сортировки полей:
     * - lastName/firstName: если null -> считать ""
     * - lastName/firstName: сравнение по trim()
     */
    public static Comparator<User> comparatorUsers() {
        // TODO
        return (u1, u2) -> 0;
    }

    /**
     * TASK 9: sortUsersAndMapToLabel
     *
     * Дан List<User> users.
     * Верни List<String> меток вида: "LAST FIRST"
     *
     * Правила:
     * - users == null -> []
     * - null users пропускать
     * - использовать сортировку comparatorUsers()
     * - если у user lastName/firstName == null -> подставить "" в метке
     */
    public static List<String> sortUsersAndMapToLabel(List<User> users) {
        // TODO
        return new ArrayList<>();
    }

    /**
     * TASK 10: counterSupplier
     *
     * Верни IntSupplier, который при каждом вызове getAsInt() возвращает:
     * 1, 2, 3, 4, ...
     *
     * Подсказка: используйте AtomicInteger.
     */
    public static IntSupplier counterSupplier() {
        // TODO
        return () -> 0;
    }

    // ===================== QUICK SANITY MAIN (optional) =====================
    public static void main(String[] args) {
        // сюда можете добавлять свои проверки
    }
}
