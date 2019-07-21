package LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/21
 * Time: 16:26
 * Description:
 */
public class Cache<K,V> extends LinkedHashMap<K,V> {

    private static final int MAX_LIMIT = 3;

    public Cache() {
        super(MAX_LIMIT, 0.75f, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_LIMIT;
    }
}
