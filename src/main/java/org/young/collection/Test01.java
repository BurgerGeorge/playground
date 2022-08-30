package org.young.collection;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        /*
        ArrayList线程不安全，底层用数组存储，便于查找和修改
        Vector线程安全，底层采用数组存储
        LinkedList线程不安全，底层使用双向链表（1.7及以后），便于增加和删除，使用很少，大部分情况都可以被ArrayList替代
         */
        List<String> l1 = new ArrayList<>(Arrays.asList( "kevin", "ja", "stephen"));
        List<String> l2 = new Vector<>();
        List<String> l3 = new LinkedList<>();
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);

        // 自定义一个比较器
        l1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(l1);

//        Set<String> s1 = new HashSet<>();
//        Set<String> s2 = new LinkedHashSet<>();
//        Set<String> s3 = new TreeSet<>();
//
//        Queue<String> q1 = new PriorityQueue<>();
//        Queue<String> q2 = new ArrayDeque<>();
//
//        Map<String, String> m1 = new HashMap<>();
//        Map<String, String> m2 = new LinkedHashMap<>();
//        Map<String, String> m3 = new Hashtable<>();
//        Map<String, String> m4 = new TreeMap<>();

    }
}
