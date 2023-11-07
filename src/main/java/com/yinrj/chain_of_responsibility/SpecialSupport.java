package com.yinrj.chain_of_responsibility;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name SpecialSupport
 */
public class SpecialSupport extends Support {
    private int specialNum;

    public SpecialSupport(String name, int specialNum) {
        super(name);
        this.specialNum = specialNum;
    }

    /**
     * 解决问题的方法
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNum() == this.specialNum;
    }
}
