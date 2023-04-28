package tacos;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        /**
         * 卷饼
         */
        WRAP,
        /**
         * 蛋白质
         */
        PROTEIN,
        /**
         * 蔬菜
         */
        VEGGIES,
        /**
         * 奶酪
         */
        CHEESE,
        /**
         * 酱汁
         */
        SAUCE
    }
}
