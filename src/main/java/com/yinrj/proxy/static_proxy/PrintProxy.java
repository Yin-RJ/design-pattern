package com.yinrj.proxy.static_proxy;

/**
 * 代理对象
 * @author yinrongjie
 * @date 2023/11/6
 * @name PrintProxy
 */
public class PrintProxy implements Printable {
    /**
     * 代理对象本身的名称
     */
    private String name;

    /**
     * 被代理对象
     */
    private Printer real;

    public PrintProxy() {
    }

    public PrintProxy(String name) {
        this.name = name;
    }

    /**
     * 设置打印机名称
     *
     * @param name
     */
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // 如果已经生成了被代理对象，那么给被代理对象赋值
            real.setPrinterName(name);
        }
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
        this.realize();
        this.real.print(content);
    }

    /**
     * 构造被代理对象
     */
    private synchronized void realize() {
        if (this.real == null) {
            this.real = new Printer(this.name);
        }
    }
}
