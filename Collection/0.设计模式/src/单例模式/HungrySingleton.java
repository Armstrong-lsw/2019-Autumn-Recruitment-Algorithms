package 单例模式;

/**
 * Create with Collection
 * User: 许清远
 * Date: 2019/7/9
 * Time: 19:51
 * Description:饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}
