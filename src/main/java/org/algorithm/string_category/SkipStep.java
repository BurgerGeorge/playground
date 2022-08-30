package org.algorithm.string_category;

public class SkipStep {
    public static void main(String[] args) {
//        System.out.println(stepsOfSkip(30));

        double d1 = 3.00001;
        System.out.println(Math.abs(d1 - 3) < 1e-3);
    }

    // 总共有n阶台阶，一次跳1或2阶，总共有几种方法跳完
    public static int stepsOfSkip(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return stepsOfSkip(n - 1) + stepsOfSkip(n - 2);
    }
}
