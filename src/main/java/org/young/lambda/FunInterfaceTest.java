package org.young.lambda;

public class FunInterfaceTest {
    public static void main(String[] args) {
        funInterfaceDemo(() -> System.out.println("hhh"));
    }

    static void funInterfaceDemo(FunInterface fun) {
        fun.doSomething();
    }
}
