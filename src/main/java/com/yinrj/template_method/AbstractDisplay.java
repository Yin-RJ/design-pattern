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

    public void display() {
        open();
        for (int i = 0; i < 5; ++i) {
            print();
        }
        close();
    }
}
