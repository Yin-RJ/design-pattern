package com.yinrj.chain_of_responsibility;

/**
 * @author yinrongjie
 * @date 2023/11/7
 * @name ChainOfResponsibilityMain
 */
public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 10);
        Support charlie = new SpecialSupport("Charlie", 12);
        Support diana = new OddSupport("Diana");
        Support elmo = new LimitSupport("Elmo", 30);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo);

        for (int i = 0; i < 50; ++i) {
            alice.support(new Trouble(i));
        }
    }
}
