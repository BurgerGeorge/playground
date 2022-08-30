package org.algorithm.string_category;

import org.algorithm.entity.MyListNode;

import java.util.List;

public class AddTwoNumber {
    public static void main(String[] args) {
        // 两数相加的测试
//        MyListNode l1 = new MyListNode(3);
//        MyListNode l2 = new MyListNode(7);
//        MyListNode l3 = new MyListNode(3);
//        l1.next = l2;
//
//        MyListNode l4 = new MyListNode(9);
//        MyListNode l5 = new MyListNode(2);
//        MyListNode l6 = new MyListNode(7);
//        MyListNode l7 = new MyListNode(9);
//        l4.next = l5;

//        MyListNode res = addTwoNumbers(l1, l4);
//        while (res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }
    }

    // 链表两数相加的实现
    public static MyListNode addTwoNumbers(MyListNode l1, MyListNode l2) {
        MyListNode dummyHead = new MyListNode();
        MyListNode cur = dummyHead;
        int singleDigit = 0, tenDigit = 0;
        while (l1 != null && l2 != null) {
            singleDigit = (l1.val + l2.val + tenDigit) % 10;
            cur.next = new MyListNode(singleDigit);
            tenDigit = l1.val + l2.val + tenDigit > 9 ? 1 : 0;
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            doRest(cur, tenDigit, l2);
        } else {
            doRest(cur, tenDigit, l1);
        }
        return dummyHead.next;
    }

    static void doRest(MyListNode cur, int tenDigit, MyListNode rest) {
        while (rest != null && tenDigit > 0) {
            cur.next = new MyListNode((rest.val + tenDigit) % 10);
            tenDigit = tenDigit + rest.val > 9 ? 1 : 0;
            cur = cur.next;
            rest = rest.next;
        }
        cur.next = rest;
        if (tenDigit == 1)
            cur.next = new MyListNode(1);
    }

    // 合并两个排序的链表
    static MyListNode mergeTwoSortedList(MyListNode l1, MyListNode l2) {
        MyListNode dummyHead = l1.val <= l2.val ? l1 : l2;
        MyListNode cur1 = l1, cur2 = l2, temp;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                temp = cur1.next;
                cur1.next = cur2;
                cur1 = temp;
            } else {
                temp = cur2.next;
                cur2.next = cur1;
                cur2 = temp;
            }
        }
        return dummyHead;
    }
}
