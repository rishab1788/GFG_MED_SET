/*package whatever //do not write package name here */

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static HashSet ht = new HashSet();
    static ArrayList al = new ArrayList();

    public static void primeNumber() {
        int i = 0;
        int num = 0;
        //Empty String
        String primeNumbers = "";

        for (i = 2; i <= 100000; i++) {
            int counter = 0;
            for (num = (int) Math.sqrt(i); num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 1) {
                ht.add(i);
                al.add(i);
            }
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        primeNumber();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();

            for (int j = 0; j < al.size(); j++) {
                int x = n - (int) al.get(j);
                if ((int) al.get(j) >= n) {
                    System.out.println(-1);
                    break;
                }
                if (ht.contains(x)) {
                    System.out.println(al.get(j) + " " + x);
                    break;
                }
            }

        }

    }
}