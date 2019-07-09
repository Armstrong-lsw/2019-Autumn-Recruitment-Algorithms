package 单例模式;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/9
 * Time: 19:48
 * Description:内部类方式的单例模式
 */
public class InnerSingleton {

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    private InnerSingleton() {}

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
