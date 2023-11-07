package com.yinrj.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name Support
 */
@Slf4j
public abstract class Support {
    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 解决问题
     * @param trouble
     */
    protected void done(Trouble trouble) {
        log.info("Trouble [{}] is resolved by [{}].", trouble, this.name);
    }

    /**
     * 不能解决问题
     * @param trouble
     */
    protected void fail(Trouble trouble) {
        log.info("Trouble [{}] can not resolve.", trouble);
    }

    /**
     * 解决问题的方法
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }


    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
