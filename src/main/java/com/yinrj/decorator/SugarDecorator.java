package com.yinrj.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 装饰者类(加糖)
 * @author yinrongjie
 * @date 2023/10/26
 * @name SugarDecorator
 */
@Slf4j
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSugar();
    }

    private void addSugar() {
        log.info("Add sugar.");
    }
}
