package patterns.factory.factorymethod;

import patterns.factory.Pizza;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/09-12:03
 * Description: 芝加哥匹萨分店
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoVeggiePizza();
        }
        return null;
    }
}
