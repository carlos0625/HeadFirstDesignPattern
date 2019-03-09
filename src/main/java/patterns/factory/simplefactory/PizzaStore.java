package patterns.factory.simplefactory;

import patterns.factory.Pizza;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/09-11:58
 * Description: 匹萨店
 */
public class PizzaStore {
    private SimpleFactory factory;

    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
