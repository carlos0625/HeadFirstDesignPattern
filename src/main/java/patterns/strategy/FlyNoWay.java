package patterns.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/06-13:40
 * Description: 飞行行为的实现，给不会飞的鸭子用(包括橡皮鸭和诱饵鸭)
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
