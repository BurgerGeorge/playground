package org.young;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArr = sentence.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            String tempStr = strArr[i];
            if (tempStr.length() >= searchWord.length()) {
                if (searchWord.equals(tempStr.substring(0, searchWord.length()))) {
                    return i + 1;
                }
            }
        }
        return -1;

        /*
        Collection:
            List:ArrayList,LinkedList,Vector,Stack
            Set:HashSet,LinkedHashSet,TreeSet
            Queue:ArrayDeque,PriorityQueue
        Map:
            HashMap,LinkedHashMap,HashTable,TreeMap
         */
    }
}
