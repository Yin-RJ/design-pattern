package com.yinrj.strategy;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author yinrongjie
 * @date 2023/11/8
 * @name MJCouponDiscount
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    /**
     * 优惠券金额计算
     * 满足x元减n元
     * @param couponInfo 优惠券折扣信息
     * @param skuPrice
     * @return
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        BigDecimal x = new BigDecimal(couponInfo.get("x"));
        BigDecimal n = new BigDecimal(couponInfo.get("n"));

        if (skuPrice.compareTo(x) < 0) {
            // 未达到满减标准
            return skuPrice;
        }

        BigDecimal discountAmount = skuPrice.subtract(n);
        if (discountAmount.compareTo(BigDecimal.ONE) < 0) {
            return BigDecimal.ONE;
        }

        return discountAmount;
    }
}
