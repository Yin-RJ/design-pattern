package com.yinrj.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体的装饰者类（加牛奶）
 * @author yinrongjie
 * @date 2023/10/26
 * @name MilkDecorator
 */
@Slf4j
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addMilk();
    }

    private void addMilk() {
        log.info("Add milk.");
    }
}
