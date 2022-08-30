package org.young.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass {
    public static void main(String[] args) throws Exception {
        // 获取到类
        Class<?> targetClass = Class.forName("org.young.reflect.TargetObject");

        // 对类进行实例化
        TargetObject tobj = (TargetObject) targetClass.newInstance();

        // 获取其中的方法
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("-------");

        Field name = targetClass.getDeclaredField("name");
        System.out.println(name);
        System.out.println("-------");

        Method welcomeMth = targetClass.getDeclaredMethod("welcome");
        String res = (String) welcomeMth.invoke(tobj);
        System.out.println(res);
    }
}
