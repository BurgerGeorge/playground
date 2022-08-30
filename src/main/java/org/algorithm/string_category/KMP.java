package org.algorithm.string_category;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {
//        System.out.println(violentMatch("aaaaab", "aab"));

        System.out.println(Arrays.toString(getNextArray("ababksabab".toCharArray())));

    }

    /*
    str1中找str2：
    假设str1中匹配到x字符，str2中匹配到y字符时二者不符，暴力匹配算法将x回退到i+1位置，y回退到0位置继续匹配
    kmp算法中x字符不回退，y字符回退到最长前缀的下一个继续匹配
     */
    public static int kmp(String s, String m) {
        if (s == null || m == null || m.length() < 1 || s.length() < m.length())
            return -1;
        char[] str1 = s.toCharArray();
        char[] str2 = m.toCharArray();
        int i1 = 0, i2 = 0;
        int[] next = getNextArray(str2);

        while (i1 < str1.length && i2 < str2.length) {
            if (str1[i1] == str2[i2]) {
                i1++;
                i2++;
            } else if (i2 == 0) {
                i1++;
            } else {
                i2 = next[i2];
            }
        }
        return i2 == str2.length ? i1 - i2 : -1;
    }

    // 得到next数组
    static int[] getNextArray(char[] ms) {
        if (ms.length == 1) {
            return new int[]{1};
        }
        int[] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int cn = 0;

        while (i < next.length) {
            if (ms[i - 1] == ms[cn]) {
                next[i++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }


    // 暴力匹配版
    public static int violentMatch(String p, String s) {
        int pLen = p.length(), sLen = s.length();
        if (pLen < sLen)
            return -1;

        for (int i = 0; i <= pLen - sLen;) {
            for (int j = 0; j < sLen;) {
                if (p.charAt(i) == s.charAt(j)) {
                    j++;
                    i++;
                    // 匹配成功，返回s在p中的索引
                    if (j == sLen) {
                        return i - j;
                    }
                } else { // 中途匹配失败
                    i = i - j + 1;
                    j = 0;
                    break;
                }
            }
        }
        return -1;
    }
}
