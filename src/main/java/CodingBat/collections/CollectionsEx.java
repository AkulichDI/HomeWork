package CodingBat.collections;

import java.util.*;
public class CollectionsEx {



    /**
     * 20 задач по коллекциям (List/Set/Map) в стиле CodingBat:
     * - 1 метод = 1 задача
     * - без ввода/вывода
     * - примеры прямо в комментариях
     *
     * Твоя задача: реализовать TODO в каждом методе.
     */

        // -------------------------
        // LIST (1..8)
        // -------------------------

        /**
         * reverseCopy([1,2,3]) -> [3,2,1]
         * reverseCopy([]) -> []
         */
        public List<Integer> reverseCopy(List<Integer> nums) {
            List<Integer> result = new ArrayList<>(nums.size());

            for (int i = nums.size(); i > 0; i--) {

                result.add(nums.get(i - 1));

            }

            return result;
        }

        /**
         * Вернуть последние n элементов (если n > size, вернуть все).
         * lastN(["a","b","c","d"], 2) -> ["c","d"]
         * lastN(["x"], 5) -> ["x"]
         */
        public List<String> lastN(List<String> words, int n) {
            // TODO
            return new ArrayList<>();
        }

        /**
         * Вернуть список без первого и последнего (если size < 3 -> пустой).
         * withoutFirstLast([1,2,3,4]) -> [2,3]
         * withoutFirstLast([1,2]) -> []
         */
        public List<Integer> withoutFirstLast(List<Integer> nums) {
            // TODO
            return new ArrayList<>();
        }

        /**
         * Вставить value после каждого target.
         * insertAfter([1,2,2,3], 2, 9) -> [1,2,9,2,9,3]
         * insertAfter([], 1, 9) -> []
         */
        public List<Integer> insertAfter(List<Integer> nums, int target, int value) {
            // TODO
            return new ArrayList<>();
        }

        /**
         * True, если список неубывающий.
         * isSortedNonDecreasing([1,1,2,5]) -> true
         * isSortedNonDecreasing([3,2]) -> false
         */
        public boolean isSortedNonDecreasing(List<Integer> nums) {
            // TODO
            return false;
        }

        /**
         * Удали повторы, оставив первые вхождения (порядок сохранить).
         * uniqueKeepFirst([1,2,1,3,2]) -> [1,2,3]
         * uniqueKeepFirst([]) -> []
         */
        public List<Integer> uniqueKeepFirst(List<Integer> nums) {
            // TODO
            return new ArrayList<>();
        }

        /**
         * Сумма всех чисел, кроме тех, что в диапазоне [lo..hi] включительно.
         * sumSkipRange([1,5,10,15], 5, 10) -> 16
         * sumSkipRange([7,8], 1, 3) -> 15
         */
        public int sumSkipRange(List<Integer> nums, int lo, int hi) {
            // TODO
            return 0;
        }

        /**
         * Отсортировать: сначала по длине, при равенстве — лексикографически.
         * sortByLengthThenAlpha(["bb","a","aa","b"]) -> ["a","b","aa","bb"]
         * sortByLengthThenAlpha([]) -> []
         *
         * Можно НЕ менять исходный список, а сортировать копию.
         */
        public List<String> sortByLengthThenAlpha(List<String> words) {
            // TODO
            return new ArrayList<>();
        }

        // -------------------------
        // SET (9..12)
        // -------------------------

        /**
         * True, если все элементы a содержатся в b.
         * isSubset({a,b}, {a,b,c}) -> true
         * isSubset({x}, {}) -> false
         */
        public boolean isSubset(Set<String> a, Set<String> b) {
            // TODO
            return false;
        }

        /**
         * Вернуть множество чисел, которые встречаются 2+ раз.
         * duplicatesSet([1,2,1,3,2,2]) -> {1,2}
         * duplicatesSet([5]) -> {}
         */
        public Set<Integer> duplicatesSet(List<Integer> nums) {
            // TODO
            return new HashSet<>();
        }

        /**
         * Сколько уникальных слов без учета регистра.
         * uniqueCountIgnoreCase(["A","a","b","B","c"]) -> 3
         * uniqueCountIgnoreCase([]) -> 0
         */
        public int uniqueCountIgnoreCase(List<String> words) {
            // TODO
            return 0;
        }

        /**
         * Вернуть числа из [start..end], которых нет в nums.
         * missingInRange({1,3,6}, 1, 6) -> {2,4,5}
         * missingInRange({}, 2, 4) -> {2,3,4}
         */
        public Set<Integer> missingInRange(Set<Integer> nums, int start, int end) {
            // TODO
            return new HashSet<>();
        }

        // -------------------------
        // MAP (13..20)
        // -------------------------

        /**
         * Если from есть — положи то же значение в to. Верни map.
         * copyIfPresent({a=hi}, "a", "b") -> {a=hi, b=hi}
         * copyIfPresent({}, "a", "b") -> {}
         *
         * (В стиле CodingBat Map-1: модифицировать и вернуть ту же map.)
         */
        public Map<String, String> copyIfPresent(Map<String, String> map, String from, String to) {
            // TODO
            return map;
        }

        /**
         * Удалить key, если его значение равно value. Верни map.
         * removeIfEquals({a=x,b=y}, "a", "x") -> {b=y}
         * removeIfEquals({a=x}, "a", "z") -> {a=x}
         */
        public Map<String, String> removeIfEquals(Map<String, String> map, String key, String value) {
            // TODO
            return map;
        }

        /**
         * Если оба ключа есть — поменять их значения местами. Верни map.
         * swapKeys({a=1,b=2}, "a", "b") -> {a=2,b=1}
         * swapKeys({a=1}, "a", "b") -> {a=1}
         */
        public Map<String, String> swapKeys(Map<String, String> map, String k1, String k2) {
            // TODO
            return map;
        }

        /**
         * Если ключа нет — поставить 1, иначе увеличить на 1. Верни map.
         * bump({a=2}, "a") -> {a=3}
         * bump({}, "x") -> {x=1}
         */
        public Map<String, Integer> bump(Map<String, Integer> map, String key) {
            // TODO
            return map;
        }

        /**
         * Частоты символов в строке.
         * charCount("aab") -> {a=2, b=1}
         * charCount("") -> {}
         */
        public Map<Character, Integer> charCount(String s) {
            // TODO
            return new HashMap<>();
        }

        /**
         * Сгруппировать числа по (n % mod).
         * groupByRemainder([1,2,3,4,5], 2) -> {1=[1,3,5], 0=[2,4]}
         * groupByRemainder([], 3) -> {}
         */
        public Map<Integer, List<Integer>> groupByRemainder(List<Integer> nums, int mod) {
            // TODO
            return new HashMap<>();
        }

        /**
         * Веди счетчик слов; каждый раз, когда слово достигает k вхождений — допиши его в результат.
         * joinWhenHitsK(["a","b","a","a","b","b"], 2) -> "ab"
         * joinWhenHitsK(["x","x","x"], 3) -> "x"
         */
        public String joinWhenHitsK(List<String> words, int k) {
            // TODO
            return "";
        }

        /**
         * Вернуть до 2 самых частых слов; при равенстве — лексикографически меньшее выше.
         * top2ByFrequency(["b","a","b","c","a","a"]) -> ["a","b"]
         * top2ByFrequency(["x"]) -> ["x"]
         * top2ByFrequency([]) -> []
         */
        public List<String> top2ByFrequency(List<String> words) {
            // TODO
            return new ArrayList<>();
        }
    }

