package com.yinrj.chain_of_responsibility;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name OddSupport
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    /**
     * 解决问题的方法
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNum() % 2 == 0;
    }
}
