package practice.topic09_collections.lesson06;
import java.util.*;
import java.util.stream.Collectors;

public class ComparatorDrill {

    // ===== MODELS =====
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

    // ===== 5 TASKS: Comparator basics =====

    /**
     * TASK 1:
     * Даны строки. Верни новый список:
     * - убрать null
     * - trim()
     * - убрать blank
     * - сортировка: length asc, потом алфавит A..Z (case-sensitive)
     */
    public static List<String> t1(List<String> s) {

        if (s == null ) return new ArrayList<>();

        return s.stream()
                .filter(Objects::nonNull)
                .filter(el -> !el.trim().isBlank())
                .map(String::trim)
                .sorted(Comparator
                        .comparing(String::length)
                        .thenComparing(Comparator.naturalOrder())
                )
                .collect(Collectors.toList());
    }

    /**
     * TASK 2:
     * Даны числа. Верни top N по убыванию.
     * - nums == null или n <= 0 -> []
     * - null элементы пропускать
     * - если чисел меньше n -> вернуть сколько есть
     * (можно stream)
     */
    public static List<Integer> t2(List<Integer> nums, int n) {
        if ( nums == null || n <= 0 ) return new ArrayList<>();

        return nums.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .collect(Collectors.toList());
    }

    /**
     * TASK 3:
     * Дана Map<String, Integer>. Верни List<String> ключей:
     * - value desc (null считать 0)
     * - при равных value: key asc
     */
    public static List<String> t3(Map<String, Integer> map) {


     return new ArrayList<>();
    }

    /**
     * TASK 4:
     * Users:
     * - users == null -> []
     * - null users пропускать
     * - firstName/lastName: trim, если null или blank -> пропустить user
     * - сортировка: lastName CI asc, firstName CI asc, age asc
     */
    public static List<User> t4(List<User> users) {
        // TODO
        return new ArrayList<>();
    }

    /**
     * TASK 5:
     * Users режим:
     * - если byAgeOnly==true: сортировка только по age asc (при равном возрасте порядок сохранить)
     * - иначе: lastName CI, firstName CI, age asc
     * - правила фильтра как в t4
     */
    public static List<User> t5(List<User> users, boolean byAgeOnly) {
        // TODO
        return new ArrayList<>();
    }
}

