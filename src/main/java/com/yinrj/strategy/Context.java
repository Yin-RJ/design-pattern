package com.yinrj.strategy;

import java.math.BigDecimal;

/**
 * @author yinrongjie
 * @date 2023/11/8
 * @name Context
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal getAmount(T content, BigDecimal price) {
        return this.couponDiscount.discountAmount(content, price);
    }
}
