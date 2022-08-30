package org.young.collection;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        Random r = new Random();

        Integer[] ints = new Integer[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = r.nextInt(50) - 25;
        }
        System.out.println(Arrays.toString(ints));

        int i = 0;
        List<Integer> li = new ArrayList<>(Arrays.asList(ints));
        // 结果为正做交换，为负则不做交换
        li.sort((Integer o1, Integer o2) -> o2 - o1);

        System.out.println(li);
    }
}
