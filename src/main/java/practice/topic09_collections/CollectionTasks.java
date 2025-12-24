package practice.topic09_collections;

import java.util.*;

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
