package org.young.collection;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        test3();
    }

    // 集合转数组
    public static void test3() {
        List<String> li = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Collections.reverse(li);
        String[] strArr = li.toArray(new String[0]); // 转数组的时候，要传入一个0长度的指定类型数组，否则会转为object类型
        System.out.println(Arrays.toString(strArr));
    }

    // 集合去重
    public static void test2() {
        List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 3, 2));
        System.out.println(li);
        Set<Integer> set = new HashSet<>(li);
        System.out.println(set);
    }

    // java8新方法的使用
    public static void test1() {
        List<String> list = new ArrayList<>();
        list.add("kevin");
        list.add("stephen");
        list.add("klay");
        list.removeIf(s -> s.length() <= 4); // 8中新添加的方法
        System.out.println(list);
    }
}
