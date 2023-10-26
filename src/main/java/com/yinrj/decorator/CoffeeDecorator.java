package com.yinrj.decorator;

/**
 * 装饰角色
 * @author yinrongjie
 * @date 2023/10/26
 * @name CoffeeDecorator
 */
public abstract class CoffeeDecorator implements ICoffee {
    private final ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        this.coffee.makeCoffee();
    }
}
