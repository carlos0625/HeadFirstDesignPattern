package patterns.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/06-13:39
 * Description: 飞行行为的实现，给真会飞的鸭子用
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying!!");
    }
}
