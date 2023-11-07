package com.yinrj.chain_of_responsibility;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name LimitSupport
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    /**
     * 解决问题的方法
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNum() < this.limit;
    }
}
