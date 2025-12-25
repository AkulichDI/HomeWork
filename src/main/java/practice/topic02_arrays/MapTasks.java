package practice.topic02_arrays;

import java.util.Map;

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






}
