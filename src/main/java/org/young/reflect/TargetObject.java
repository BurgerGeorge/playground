package org.young.reflect;

public class TargetObject {
    private String name;

    public TargetObject() {
        name = "george";
    }

    public String welcome() {
        return "good night;";
    }

    private void saySomething() {
        System.out.println("hehehe");
    }
}
