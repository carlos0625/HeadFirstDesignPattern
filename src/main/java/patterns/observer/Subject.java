package patterns.observer;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/03/07-11:03
 * Description: 主题类的接口
 */
public interface Subject {
    /**
     * 注册观察者对象
     * @param o 观察者对象
     */
    void registerObserver(Observer o);

    /**
     * 从观察者列表中移除
     * @param o 观察者对象
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
