package org.young.Thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
    public static void main(String[] args) {
        // 查看一个java进程有多少线程
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo ti : threadInfos) {
            System.out.println(ti.getThreadId() + ">>>" + ti.getThreadName());
        }
    }
}
