package com.yinrj.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体构件角色(要进行装饰的对象)
 * @author yinrongjie
 * @date 2023/10/26
 * @name Coffee
 */
@Slf4j
public class OriginalCoffee implements ICoffee {
    @Override
    public void makeCoffee() {
        log.info("This is an original coffee.");
    }
}
