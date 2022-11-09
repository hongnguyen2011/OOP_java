import java.util.*;

public class Maps {
    public static int count(Map<Integer,Integer> map) {
        return map.size();
    }
    public static void empty(Map<Integer,Integer> map) {
        map.clear();
    }
    public static boolean contains(Map<Integer,Integer> map, int key) {
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer,Integer> map, int key, int value) {
        return map.containsKey(key) && map.containsValue(value);
    }
    public static Set<Integer> KeySet(Map<Integer, Integer> map) {
        Set<Integer> set = map.keySet();
        return set;
    }
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        Collection<Integer> values = map.values();
        return values;
    }
    public static String getColor(int value) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.get(value);
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();

        hash_map.put(10, 3);
        hash_map.put(15, 3);
        hash_map.put(20, 3);
        hash_map.put(25, 5);
        hash_map.put(30, 2);
        // Count
        System.out.println("Count: " + count(hash_map));
        // empty
        empty(hash_map);
        System.out.println("empty: " + hash_map);
        hash_map.put(10, 3);
        hash_map.put(15, 3);
        hash_map.put(20, 3);
        hash_map.put(25, 5);
        hash_map.put(30, 2);
        //cotains
        System.out.println("cotains");
        System.out.println(contains(hash_map,3));
        //cotain key vaule
        System.out.println(containsKeyValue(hash_map,3,10));
        //key set
        Set<Integer> set1 = new HashSet<>();
        set1 = KeySet(hash_map);
        System.out.println("Key set: " + set1);
        //Get color
        System.out.println(getColor(2));
    }
}