package com.yinrj.template_method;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name TemplateMethodClient
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('j');
        d1.display();
        AbstractDisplay d2 = new StringDisplay("Hello");
        d2.display();
    }
}
