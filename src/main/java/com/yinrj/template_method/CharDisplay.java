package com.yinrj.template_method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name CharDisplay
 */
@Slf4j
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        log.info(">>>>>>>>>>>>>>>>>>");
    }

    @Override
    protected void close() {
        log.info("<<<<<<<<<<<<<<<<<<");
    }

    @Override
    protected void print() {
        log.info(String.valueOf(this.ch));
    }
}
