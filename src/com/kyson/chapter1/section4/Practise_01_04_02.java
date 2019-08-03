package com.kyson.chapter1.section4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/*
*
1.4.2 修改 TreeSum, 正确处理两个较大的int值相加可能溢出的情况

1.4.2 Modify ThreeSum to work properly even when the int values are so
* large that adding two of them might cause overflow.
* */
public class Practise_01_04_02 {

    public static class ThreeSum2 {
        public static int count(long[] a) { // Count triples that sum to 0.
            long N = a.length;
            int cnt = 0;
            for (int i = 0; i < N; i++)
                for (int j = i + 1; j < N; j++)
                    for (int k = j + 1; k < N; k++)
                        if (a[i] + a[j] + a[k] == 0)
                            cnt++;
            return cnt;
        }

        public static void main(String[] args) throws Exception {
            String filePathString = System.getProperty("user.dir");
            String intFileString = filePathString
                    + "/src/com/kyson/chapter1/section4/" + "5ints.txt";
            In in = new In(intFileString);
            long[] a = in.readAllLongs();
            for (int i = 0; i < a.length; i++) {
                long tmp = i;
                if (tmp > Long.MAX_VALUE) {
                    throw new Exception();
                }
                if (tmp < Long.MIN_VALUE) {
                    throw new Exception();
                }
            }
            StdOut.println(count(a));
        }
    }
}