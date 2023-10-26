package com.yinrj.decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    public void tesDecoratorPattern() {
        // 提供一杯原味的咖啡
        ICoffee originalCoffee = new OriginalCoffee();
        originalCoffee.makeCoffee();

        // 我需要在原味咖啡上加奶
        ICoffee milkCoffee = new MilkDecorator(originalCoffee);
        milkCoffee.makeCoffee();

        // 我想在原味咖啡上先加糖、再加奶
        ICoffee sugarMilkCoffee = new MilkDecorator(new SugarDecorator(originalCoffee));
        sugarMilkCoffee.makeCoffee();
    }

}