package CodingBat.collections;

import java.util.*;

import static java.util.Collections.sort;

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
           /* как правильно
            Objects.requireNonNull(words,"words is null");

            if (n < 0){
                 throw new IllegalArgumentException("n < 0");
            }
            int size = words.size();
            int start = Math.max(0, size-n);
            return words.subList(start, size);

            */


            if ( n > words.size() ) return words;
            ArrayList<String> result = new ArrayList<>(n);
            for (int i = words.size() - n; i < words.size(); i++) {
                    result.add(words.get(i));
                }
            return result;


        }

        /**
         * Вернуть список без первого и последнего (если size < 3 -> пустой).
         * withoutFirstLast([1,2,3,4]) -> [2,3]
         * withoutFirstLast([1,2]) -> []
         */
        public List<Integer> withoutFirstLast(List<Integer> nums) {
            Objects.requireNonNull(nums, "nums must not be null");

            if (nums.size() < 3) return new ArrayList<>();

            return new ArrayList<>(nums.subList(1, nums.size() - 1));
        }

        /**
         * Вставить value после каждого target.
         * insertAfter([1,2,2,3], 2, 9) -> [1,2,9,2,9,3]
         * insertAfter([], 1, 9) -> []
         */
        public List<Integer> insertAfter(List<Integer> nums, int target, int value) {

            Objects.requireNonNull(nums, "nums must not be null");

            List<Integer> result = new ArrayList<>(nums);

            ListIterator<Integer> it = result.listIterator();

            while (it.hasNext()) {
                Integer x = it.next();
                if (x != null && x == target) {
                    it.add(value);
                }
            }
            return result;
        }

        /**
         * True, если список неубывающий.
         * isSortedNonDecreasing([1,1,2,5]) -> true
         * isSortedNonDecreasing([3,2]) -> false
         */
        public boolean isSortedNonDecreasing(List<Integer> nums) {

            Objects.requireNonNull(nums, "nums must not be null");
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < nums.get(i - 1)) return false;
            }
            return true;
        }

        /**
         * Удали повторы, оставив первые вхождения (порядок сохранить).
         * uniqueKeepFirst([1,2,1,3,2]) -> [1,2,3]
         * uniqueKeepFirst([]) -> []
         */
        public List<Integer> uniqueKeepFirst(List<Integer> nums) {

            Objects.requireNonNull(nums, "nums must not be null");

            Set<Integer> result = new LinkedHashSet<>(nums);

            return new ArrayList<>(result);
        }

        /**
         * Сумма всех чисел, кроме тех, что в диапазоне [lo..hi] включительно.
         * sumSkipRange([1,5,10,15], 5, 10) -> 16
         * sumSkipRange([7,8], 1, 3) -> 15
         */
        public int sumSkipRange(List<Integer> nums, int lo, int hi) {

            Objects.requireNonNull(nums, "nums must not be null");

            return nums.stream()
                    .filter(Objects::isNull)
                    .filter(x -> x < lo || x > hi)
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        /**
         * Отсортировать: сначала по длине, при равенстве — лексикографически.
         * sortByLengthThenAlpha(["bb","a","aa","b"]) -> ["a","b","aa","bb"]
         * sortByLengthThenAlpha([]) -> []
         *
         * Можно НЕ менять исходный список, а сортировать копию.
         */
        public List<String> sortByLengthThenAlpha(List<String> words) {

            Objects.requireNonNull(words, "words must not be null");

            List<String> result = new ArrayList<>(words);

            result.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
            return result;
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
            Objects.requireNonNull(a, "a must not be null");
            Objects.requireNonNull(b, "b must not be null");
            for (String el : a){
                if (!b.contains(el))return false ;
            }
            return true;
        }

        /**
         * Вернуть множество чисел, которые встречаются 2+ раз.
         * duplicatesSet([1,2,1,3,2,2]) -> {1,2}
         * duplicatesSet([5]) -> {}
         */
        public Set<Integer> duplicatesSet(List<Integer> nums) {

            Objects.requireNonNull(nums, "nums must not be null");
            Set<Integer> tmp = new HashSet<>();
            Set<Integer> result = new HashSet<>();

            for ( Integer el : nums ){
                if ( !tmp.add(el)){
                    result.add(el);
                }
            }

            return result;
        }

        /**
         * Сколько уникальных слов без учета регистра.
         * uniqueCountIgnoreCase(["A","a","b","B","c"]) -> 3
         * uniqueCountIgnoreCase([]) -> 0
         */
        public int uniqueCountIgnoreCase(List<String> words) {
            Objects.requireNonNull(words, "words must not be null");
            Set<String> data = new HashSet<>();
            int counter = 0;
            for (String el : words){
                if ( el != null && data.add(el.toLowerCase())){
                    counter++;
                }
            }
            return counter;
        }


        /**
         * Вернуть числа из [start..end], которых нет в nums.
         * missingInRange({1,3,6}, 1, 6) -> {2,4,5}
         * missingInRange({}, 2, 4) -> {2,3,4}
         */
        public Set<Integer> missingInRange(Set<Integer> nums, int start, int end) {

            Objects.requireNonNull(nums, "nums must not be null");

            int lo = Math.min(start, end);
            int hi = Math.max(start, end);

            Set<Integer> result = new HashSet<>();
            for (int x = lo; x <= hi; x++) {
                result.add(x);
            }

            for (Integer el : nums) {
                if (el != null) {
                    result.remove(el);
                }
            }
            return result;
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

            Objects.requireNonNull(map, "map must not be null");
            if (from == null || to == null) return map;

            if (map.containsKey(from)) {
                map.put(to, map.get(from));
            }
            return map;
        }

        /**
         * Удалить key, если его значение равно value. Верни map.
         * removeIfEquals({a=x,b=y}, "a", "x") -> {b=y}
         * removeIfEquals({a=x}, "a", "z") -> {a=x}
         */
        public Map<String, String> removeIfEquals(Map<String, String> map, String key, String value) {
            Objects.requireNonNull(map, "Map must not be null");
            map.remove(key,value);
            return map;
        }

        /**
         * Если оба ключа есть — поменять их значения местами. Верни map.
         * swapKeys({a=1,b=2}, "a", "b") -> {a=2,b=1}
         * swapKeys({a=1}, "a", "b") -> {a=1}
         */
        public Map<String, String> swapKeys(Map<String, String> map, String k1, String k2) {
            Objects.requireNonNull(map, "map must not be null");
            if (k1 == null || k2 == null || Objects.equals(k1, k2)) return map;

            if (!map.containsKey(k1) || !map.containsKey(k2)) return map;

            String v1 = map.get(k1);
            String v2 = map.get(k2);

            map.put(k1, v2);
            map.put(k2, v1);

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

