package com.kyson.chapter1.section3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
*1.3.15 编写一个Queue的用例，接受一个命令行参数k并打印出标准输入中的倒数第k个字符串（假设标准输入中至少有k个字符串）。

1.3.15 Write a Queue client that takes a command-line argument k and prints the kth from the last string found on
standard input (assuming that standard input has k or more strings).
*
* */
public class Practise_01_03_15 {

    public static void printItem(int k, Queue<String> a)
    {
        int index = a.size() - k;
        for (int j = 0; j <= index; ++j)
        {
            String b = a.dequeue();
            if (j == index)
                StdOut.print(b);
        }

    }


    public static void main(String[] args)
    {

        Queue<String> a = new Queue<String>();
        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            a.enqueue(str);
        }

        printItem(2,a);
    }



}
