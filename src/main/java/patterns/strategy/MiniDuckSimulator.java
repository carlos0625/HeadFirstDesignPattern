package patterns.strategy;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/06-13:54
 * Description: 客户端测试
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        //看起来是什么
        duck.display();
        //飞的行为
        duck.performFly();
        //叫的行为
        duck.performQuack();
    }
}
