package org.young.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTraverseTest {
    public static void main(String[] args) {
        test1();
    }

    // iterator遍历entrySet
    public static void test1() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "万历十五年");
        map.put(2, "可叹，落叶飘零");
        map.put(3, "踏风！");

        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.print(entry.getKey() + "--");
            System.out.println(entry.getValue());
        }
    }
}
