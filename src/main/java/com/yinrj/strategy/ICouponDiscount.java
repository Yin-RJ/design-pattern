package com.yinrj.strategy;

import java.math.BigDecimal;

/**
 * 优惠券金额计算，Strategy角色
 * @author yinrongjie
 * @date 2023/11/8
 * @name ICouponDiscount
 */
public interface ICouponDiscount<T> {
    /**
     * 优惠券金额计算
     * @param couponInfo 优惠券折扣信息
     * @param skuPrice
     * @return
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
