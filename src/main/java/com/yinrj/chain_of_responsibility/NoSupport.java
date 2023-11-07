package com.yinrj.chain_of_responsibility;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name NoSupport
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
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
        return false;
    }
}
