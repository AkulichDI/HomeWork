package practice.topic09_collections;

import java.util.*;

public class CollectionTasks {


    public static boolean validatorNullString(String s){
        if (s == null) return true;
        s = s.trim();
        if (s.isBlank()) return true;
        return false;
    }


    /**
     * КОЛЛЕКЦИИ — ЗАДАЧА 3: invert(Map<String, String> map)
     *
     * ЧТО ДЕЛАЕТ:
     * Меняет местами ключи и значения: key->value станет value->key.
     *
     * ПРАВИЛА:
     * 1) map == null -> вернуть пустую Map
     * 2) Если среди значений есть повторы (две разные пары дают одинаковое value)
     *    -> бросить IllegalArgumentException("Повторяющееся значение: <value>")
     * 3) null key или null value -> пропустить пару
     *
     * ПРИМЕР:
     * {"a":"1", "b":"2"} -> {"1":"a", "2":"b"}
     * {"a":"1", "b":"1"} -> исключение (value "1" повторяется)
     */
    public static Map<String, String> invert(Map<String, String> map) {
       if(map == null )return new HashMap<>();
       HashMap<String,String> result = new HashMap<>();
       for (Map.Entry<String ,String>  data : map.entrySet() ){
           result.put(data.getValue(), data.getKey());
       }
        return result;
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

}
