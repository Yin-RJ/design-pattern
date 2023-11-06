package com.yinrj.proxy.static_proxy;

/**
 * 主体接口，保证代理类和实际主体的实现方法一致
 * @author yinrongjie
 * @date 2023/11/6
 * @name Printable
 */
public interface Printable {
    /**
     * 设置打印机名称
     * @param name
     */
    void setPrinterName(String name);

    /**
     * 获取打印机名称
     * @return
     */
    String getPrinterName();

    /**
     * 打印一个字符串
     * @param content
     */
    void print(String content);
}
