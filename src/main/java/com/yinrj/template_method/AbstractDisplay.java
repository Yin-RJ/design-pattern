package com.yinrj.template_method;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name AbstractDisplay
 */
public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void close();

    protected abstract void print();

    /**
     * final是因为禁止子类重写该方法
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; ++i) {
            print();
        }
        close();
    }
}
