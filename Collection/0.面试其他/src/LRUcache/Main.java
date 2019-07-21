package LRUcache;

import java.util.Map;
import java.util.Set;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/21
 * Time: 16:27
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        Cache<Integer, Integer> cache = new Cache<>();
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.put(5, 5);
        System.out.println(cache.size());
        Set<Map.Entry<Integer, Integer>> entrySet = cache.entrySet();
        entrySet.forEach(e ->
                System.out.println(String.format("K:%d-----V:%d", e.getKey(), e.getValue())));
    }

}
