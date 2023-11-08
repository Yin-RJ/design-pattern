package com.yinrj.strategy;

import java.math.BigDecimal;

/**
 * @author yinrongjie
 * @date 2023/11/8
 * @name NYGCouponDiscount
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 优惠券金额计算
     *
     * @param couponInfo 优惠券折扣信息
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(String.valueOf(couponInfo));
    }
}
