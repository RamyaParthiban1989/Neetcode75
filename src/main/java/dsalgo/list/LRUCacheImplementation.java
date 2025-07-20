package dsalgo.list;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheImplementation {

    private HashMap<String,String> cache = new HashMap<>();

    LinkedList<String> list = new LinkedList<>();

    public static int threshold =3;

    public static int count=0;

    boolean addNew(String key, String data){
        if(count<threshold) {
            cache.put(key, data);
            list.add(key);
            count++;
            return true;
        }
        else{
            evict();
            cache.put(key, data);
            list.add(key);
            count++;
            return true;
        }
    }

    boolean evict(){
        String key = list.get(0);
        cache.remove(key);
        list.remove(key);
        return true;
    }

    boolean visit(String key){
        if(cache.containsKey(key) && list.contains(key)){
            list.remove(key);
            list.addLast(key);
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        LRUCacheImplementation cache = new LRUCacheImplementation();

        cache.addNew("1", "One");
        cache.addNew("2", "Two");
        cache.addNew("3", "Three");

        System.out.println("Cache after initial puts: " + cache); // Expected: {1=One, 2=Two, 3=Three}

        cache.visit("1"); // Access 1, making it most recently used
        System.out.println("Cache after getting 1: " + cache); // Expected: {2=Two, 3=Three, 1=One}

        cache.addNew("4", "Four"); // Add 4, 2 should be evicted (least recently used)
        System.out.println("Cache after putting 4: " + cache); // Expected: {3=Three, 1=One, 4=Four}

        cache.addNew("5", "Five"); // Add 5, 3 should be evicted
        System.out.println("Cache after putting 5: " + cache); // Expected: {1=One, 4=Four, 5=Five}
    }

}
