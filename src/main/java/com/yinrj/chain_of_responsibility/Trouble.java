package com.yinrj.chain_of_responsibility;

/**
 * 发生问题要处理的类
 * @author yinrongjie
 * @date 2023/11/7
 * @name Trouble
 */
public class Trouble {
    private int num;

    public Trouble(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "num=" + num +
                '}';
    }
}
