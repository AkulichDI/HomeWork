package practice.topic09_collections.lesson06;

import java.util.*;
import java.util.stream.Collectors;

public class SortLesson06   {


    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a4");
        long countA1 =  collection.stream()
                .filter(a -> a.equals("a1"))
                .count();
        System.out.println(countA1);
        System.out.println(collection.stream().findFirst().orElse("0"));
        System.out.println(collection.stream().skip(collection.size() -1 ).findFirst().orElse("empty"));
        System.out.println(collection.stream().filter("a3":: equals).findFirst().get());
        System.out.println(collection.stream().skip(2).findFirst().get());
        System.out.println(collection.stream().skip(1).limit(2).collect(Collectors.toList()));

        List<Integer> data = new ArrayList<>(Arrays.asList(5,1,4,65,8,76,6,0, null ));

        System.out.println(SortLesson06.topN(data, 2));


    }




    /**
     * ЗАДАЧА 6.1: sortByLengthThenAlpha
     *
     * Верни НОВЫЙ список строк, отсортированный:
     * 1) по длине (возрастание)
     * 2) при равной длине — по алфавиту (A..Z)
     *
     * Правила:
     * - items == null -> пустой список
     * - null/blank игнорировать
     * - элементы trim() перед сортировкой
     * - исходный список не менять
     */
    public static List<String> sortByLengthThenAlpha(List<String> items) {
        if (items == null ) return new ArrayList<>();

        return items.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(s-> !s.isBlank())
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }

    /**
     * ЗАДАЧА 6.2: topN
     *
     * Даны числа. Верни список из N самых больших чисел (по убыванию).
     *
     * Правила:
     * - nums == null -> пустой список
     * - N <= 0 -> пустой список
     * - null элементы пропускать
     * - если элементов меньше N -> вернуть сколько есть
     * - исходный список не менять
     *
     * Подсказка: копия списка + sort + subList
     */
    public static List<Integer> topN(List<Integer> nums, int n) {

        if ( nums == null || n <= 0 ) return new ArrayList<>();
        Comparator<Integer> reverseInt = Comparator.reverseOrder();

        return nums.stream()
                .filter(e -> e != null)
                .sorted(reverseInt)
                .limit(n)
                .collect(Collectors.toList());
    }

    /**
     * ЗАДАЧА 6.3: stableSortByScore
     *
     * Есть список оценок (score). Нужно отсортировать по убыванию score.
     * ВАЖНО: если score одинаковые, порядок должен остаться как в исходном списке.
     *
     * Правила:
     * - scores == null -> пустой список
     * - исходный список не менять
     *
     * Подсказка: Java сортировка List стабильная, если компаратор для равных возвращает 0.
     */
    public static List<Score> stableSortByScore(List<Score> scores) {

        if (scores == null ) return new ArrayList<>();

        return scores.stream().sorted(Comparator.comparing(Score::getScore).reversed()).collect(Collectors.toList());
    }



    public static class Score {
        private final String name;
        private final int score;

        public Score(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() { return name; }
        public int getScore() { return score; }

        @Override
        public String toString() {
            return name + ":" + score;
        }
    }

    /**
     * ЗАДАЧА 6.4: sortMapKeysByValueThenKey
     *
     * Дана Map<String, Integer>. Верни список ключей, отсортированный:
     * 1) по значению value (убывание)
     * 2) при равных value — по ключу key (возрастание)
     *
     * Правила:
     * - map == null -> пустой список
     * - если value == null -> считать как 0
     */
    public static List<String> sortMapKeysByValueThenKey(Map<String, Integer> map) {
        if ( map == null ) return new ArrayList<>();
        Comparator<Integer> sortAsc = Integer::compareTo;
        return map.entrySet().stream()
                .sorted(
                        Comparator
                                .comparingInt((Map.Entry<String, Integer> e) -> e.getValue() == null ? 0 : e.getValue())
                                .reversed()
                                .thenComparing(Map.Entry::getKey)
                )
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

    /**
     * ЗАДАЧА 6.5: sortUsers
     *
     * Отсортировать пользователей:
     * 1) по фамилии (case-insensitive)
     * 2) по имени (case-insensitive)
     * 3) по возрасту (возрастание)
     *
     * Правила:
     * - users == null -> пустой список
     * - null элементы пропускать
     * - фамилию/имя trim() и blank игнорировать (если у пользователя blank имя/фамилия — пропустить такого пользователя)
     * - исходный список не менять
         */
        public static List<User> sortUsers(List<User> users) {
            if ( users == null ) return new ArrayList<>();

            return users.stream()
                    .filter(Objects::nonNull)
                    .filter(u -> u.getLastName() != null && !u.getLastName().trim().isBlank())
                    .filter(u -> u.getFirstName() != null && !u.getFirstName().trim().isBlank())
                   /* .sorted(
                            Comparator.comparing(u -> u.getLastName().trim(), String.CASE_INSENSITIVE_ORDER)
                                    .thenComparing(u -> u.getFirstName().trim(), String.CASE_INSENSITIVE_ORDER)
                                    .thenComparingInt(User::getAge)
                    )*/
                    .collect(Collectors.toList());
        }

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
        public String getLastName() { return lastName; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return lastName + " " + firstName + " (" + age + ")";
        }
    }



}
