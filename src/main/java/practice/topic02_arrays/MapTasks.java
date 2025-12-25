package practice.topic02_arrays;

import java.util.*;

public class MapTasks {

    public static void increment(Map<String, Integer> map, String key, int delta) {
        if ( map == null ) throw new IllegalArgumentException("map == null");
        if (key == null ) throw new IllegalArgumentException("key пустой");
        key = key.trim();
        if(key.isEmpty()) throw new IllegalArgumentException("key пустой");

        if (map.containsKey(key)) {
            Integer curObj = map.get(key);
            int cur = (curObj == null) ? 0 : curObj;
            int t = cur + delta;

            if (t == 0) map.remove(key);
            else map.put(key, t);

        } else {
            if (delta != 0) {
                map.put(key, delta);
            }
        }
    }

    public static boolean renameKey(Map<String, Integer> map, String oldKey, String newKey) {

        if (map == null) throw new IllegalArgumentException("map == null");
        if (oldKey == null || newKey == null) throw new IllegalArgumentException("key пустой");

        oldKey = oldKey.trim();
        newKey = newKey.trim();
        if (oldKey.isEmpty() || newKey.isEmpty()) throw new IllegalArgumentException("key пустой");

        if (oldKey.equals(newKey)) return true;

        if (!map.containsKey(oldKey)) return false;

        if (map.containsKey(newKey)) throw new IllegalArgumentException("newKey уже существует");

        Integer val = map.get(oldKey);
        map.remove(oldKey);
        map.put(newKey, val);
        return true;
    }

    public static int sumValues(Map<String, Integer> map) {
        if(map == null ) throw new IllegalArgumentException("map == null");
        int result = 0;
        if (map.values() != null) {
            List<Integer> l = new ArrayList<Integer>(map.values());
            for (var lit : l) {
                if (lit == null || lit == 0 ) continue;
                result += lit;
            }
        }
      return result;
    }


    public static void removeIfValueLessThan(Map<String, Integer> map, int threshold) {
        if(map == null ) throw new IllegalArgumentException("Map == null");
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<String,Integer> e = it.next();
            Integer v = e.getValue();
            int vi = (v== null) ? 0: v;
            if (vi <threshold){
                it.remove();

            }
        }


    }



}
