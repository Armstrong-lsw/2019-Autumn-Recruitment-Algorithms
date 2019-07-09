package 单例模式;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/9
 * Time: 19:44
 * Description: 双重检查加锁方式的单例模式
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

}
