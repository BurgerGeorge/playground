package org.algorithm.string_category;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceSomeChar {
    public static void main(String[] args) {
//        String s = "good night, mr.robot and mrs.robot.";
//        System.out.println(s.replace(" ", "%20"));

        String[] strs = new String[]{"flower", "flow", "flight"};
        longestPrefix(strs);
    }

    static String replaceIt(String s) {
        return s.replaceAll(" ", "%20");
    }

    // 一些字符串的最长前缀
    static void longestPrefix(String[] strings) {
        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));
        String start = strings[0];
        String end = strings[strings.length - 1];
        int index = 0;
        while (index < start.length() && index < end.length()) {
            if (start.charAt(index) == end.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        System.out.println("index==" + index);
        System.out.println(start.substring(0, index));
    }

    // 求括号的匹配深度
    static int depthOfBracket(String s) {
        int res = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
        return res;
    }
}
