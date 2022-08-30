package org.young.collection;

import org.young.dao.Pet;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
//        test2();

        HashMap<String, String> map = new HashMap<>();
        System.out.println(map.put("key1", null));
        System.out.println(map.put("key1", "value1"));
        System.out.println(map.put("key2", "value2"));
        System.out.println(map.put("key2", "value3"));
        System.out.println(map);
    }

    public static void test2() {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("kevin"));
        System.out.println(set.add("kevin"));
        System.out.println(set);
    }

    // 测试构建hashset时传入比较器
    public static void test01() {
        TreeSet<Pet> set1 = new TreeSet<>(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        TreeSet<Pet> set = new TreeSet<>((Pet p1, Pet p2) -> {
            return p1.getAge() - p2.getAge();
        });
        set.add(new Pet("kaikai", 3));
        set.add(new Pet("qiqi", 2));
        set.add(new Pet("steve", 5));
        for (Pet p : set) {
            System.out.println(p);
        }
    }
}
