package patterns.factory.simplefactory;

import patterns.factory.Pizza;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/09-11:56
 * Description: 简单工厂模式
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        if ("Cheese".equals(type)) {
            return new CheesePizza();
        } else if ("Veggie".equals(type)) {
            return new VeggiePizza();
        }
        return null;
    }
}
