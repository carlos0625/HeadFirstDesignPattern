package patterns.decorator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/08-8:50
 * Description: 调料类，充当抽象装饰着
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 对父类方法的一个抽象
     * @return description for the product.
     */
    @Override
    public abstract String getDescription();
}
