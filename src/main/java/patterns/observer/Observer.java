package patterns.observer;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/03/07-11:04
 * Description: 观察者接口
 */
public interface Observer {
    /**
     * 更新观察者
     * @param temp 温度
     * @param humidity 适度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
