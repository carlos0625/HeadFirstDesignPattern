package patterns.decorator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/03/08-8:47
 * Description: 饮料，抽象类
 */
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 返回咖啡价格
     * @return price
     */
    public abstract double cost();
}
