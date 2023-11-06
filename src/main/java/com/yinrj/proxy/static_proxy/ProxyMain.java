package com.yinrj.proxy.static_proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinrongjie
 * @date 2023/11/6
 * @name ProxyMain
 */
@Slf4j
public class ProxyMain {
    public static void main(String[] args) {
        Printable printer = new PrintProxy("Proxy printer");
        log.info("This is [{}] printer.", printer.getPrinterName());
        printer.setPrinterName("Proxy printer1");
        log.info("This is [{}] printer.", printer.getPrinterName());
        printer.print("This is print content.");
    }
}
