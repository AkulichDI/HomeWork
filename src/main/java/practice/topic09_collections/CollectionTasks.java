package practice.topic09_collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTasks {
    public static boolean validatorNullString(String s){
        if (s == null) return true;
        s = s.trim();
        if (s.isBlank()) return true;
        return false;
    }
    public static Map<String, String> invert(Map<String, String> map) {
       if(map == null )return new HashMap<>();
       HashMap<String,String> result = new HashMap<>();
       for (Map.Entry<String ,String>  data : map.entrySet() ){
           result.put(data.getValue(), data.getKey());
       }
        return result;
    }
    public static String topWord(List<String> words) {
        if (words == null) return null;
        Map<String, Integer> freq = new HashMap<>();
        String bestWord = null;
        int bestCount = 0;
        for (String w : words) {
            if (w == null) continue;
            w = w.trim();
            if (w.isEmpty()) continue;

            int newCount = freq.getOrDefault(w, 0) + 1;
            freq.put(w, newCount);

            if (newCount > bestCount) {
                bestCount = newCount;
                bestWord = w;
            }
        }
        return bestWord;
    }
    public static Map<Character, Integer> charFrequency(String s) {
        if (s == null) return new HashMap<>();
        Map<Character ,Integer> result = new LinkedHashMap<>();
        for (char lit : s.toCharArray()){
            result.put( lit, result.getOrDefault(lit, 0) + 1);
        }
        return result;
    }
    public static Character firstUniqueChar(String s) {
        if(s == null)return null;
        Map<Character,Integer> result = charFrequency(s);
        for (Map.Entry<Character,Integer> l : result.entrySet()){
            if(l.getValue() == 1 ){
                return l.getKey();
            }
        }
        return null;
    }

    public static Map<String, Integer> mergeCounts(Map<String, Integer> a, Map<String, Integer> b) {
        Map<String, Integer> result = new HashMap<>();
        if (a != null) {
            for (Map.Entry<String, Integer> e : a.entrySet()) {
                String key = e.getKey();
                Integer val = e.getValue();
                result.put(key, val == null ? 0 : val);
            }
        }
        if (b != null) {
            for (Map.Entry<String, Integer> e : b.entrySet()) {
                String key = e.getKey();
                Integer val = e.getValue();

                int add = (val == null ? 0 : val);
                int old = result.getOrDefault(key, 0);

                result.put(key, old + add);
            }
        }
        return result;
    }

    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        if(words ==null) return new HashMap<>();
        Map<Integer,List<String>> result = new HashMap<>();
        for (var word : words){
            if(validatorNullString(word))continue;
            word = word.trim();
            result.computeIfAbsent(word.length(), l -> new ArrayList<>()).add(word);
        }
        return result;
    }

    public static int mostFrequentLength(List<String> words) {
        if (words == null ) return -1;
        Map<Integer, Integer> result = new HashMap<>();
        int wordA = -1;
        int maxCountW = 0;

        for (String word : words){
            if (word == null) continue;
            word = word.trim();
            if (word.isEmpty()) continue;
            int len = word.length();
            if (validatorNullString(word))continue;
            int newInt = result.getOrDefault(word.length(), 0) + 1;
            result.put(word.length(), newInt);
            if(newInt > maxCountW || (newInt == maxCountW && (wordA == -1 || len < wordA))){
                maxCountW = newInt;
                wordA = word.length();
            }
        }
        return wordA;
    }





    public static Set<String> unique(List<String> words) {
        if(words == null ) return new LinkedHashSet<>();
        Set<String> result = new HashSet<>() ;
        for (String word : words ){
            if(validatorNullString(word))continue;
            word =  word.trim();
            result.add(word);
        }
        return result;
    }

    public static Map<String, Integer> frequency(List<String> words) {
        if (words == null || words.isEmpty()) return new HashMap<>();
        HashMap<String,Integer> result = new HashMap<>();
        for( String word : words ) {
            if (validatorNullString(word))continue;
            word = word.trim();
            result.put(word,result.getOrDefault(word, 0 ) + 1);

        }
        return result;
    }

    public static Map<Long, User> indexById(List<User> users) {
        if(users == null) return new HashMap<>();
      Map<Long, User> result = users.stream()
              .filter(Objects::nonNull)
              .filter(element -> element.getId() > 0)
              .collect(Collectors.toMap(
                      User::getId,
                      user -> user,
                      (oldVal, newVal) ->
                              {throw new IllegalArgumentException("Дубликат id: " + oldVal.getId());
                                  },
                      HashMap::new
              ));
       return result;
    }

    public static class User {
        private final long id;
        private final String name;

        public User (long id, String name){
            this.id = id;
            this.name = name.trim();
        }
        public long getId (){return this.id;}
        public String getName(){return this.name;};



    }

}

