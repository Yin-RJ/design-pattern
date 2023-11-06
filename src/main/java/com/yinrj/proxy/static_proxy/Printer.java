package com.yinrj.proxy.static_proxy;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * RealSubject
 * @author yinrongjie
 * @date 2023/11/6
 * @name Printer
 */
@Slf4j
public class Printer implements Printable {
    private String name;

    public Printer() {
        // 表示生成这个Printer实例是一个非常耗时或者消耗资源的操作
        this.heavyJob("Printer实例生成中。。。");
    }

    public Printer(String name) {
        this.name = name;
        // 表示生成这个Printer实例是一个非常耗时或者消耗资源的操作
        this.heavyJob("Printer实例生成中。。。");
    }

    /**
     * 设置打印机名称
     *
     * @param name
     */
    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    /**
     * 获取打印机名称
     *
     * @return
     */
    @Override
    public String getPrinterName() {
        return this.name;
    }

    /**
     * 打印一个字符串
     *
     * @param content
     */
    @Override
    public void print(String content) {
        log.info("This is print [{}]", this.name);
        log.info("Print content is [{}]", content);
    }

    /**
     * 表示要做一个非常重的操作
     * @param str
     */
    @SneakyThrows
    private void heavyJob(String str) {
        log.info(str);
        for (int i = 0; i < 10; ++i) {
            Thread.sleep(1000);
            log.info(".");
        }
        log.info("Heavy job finished.");
    }
}
