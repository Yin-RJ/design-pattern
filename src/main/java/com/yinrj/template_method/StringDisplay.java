package com.yinrj.template_method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name StringDisplay
 */
@Slf4j
public class StringDisplay extends AbstractDisplay {
    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    protected void open() {
        log.info("-----------------------");
    }

    @Override
    protected void close() {
        log.info("++++++++++++++++++++++");
    }

    @Override
    protected void print() {
        log.info(content);
    }
}
