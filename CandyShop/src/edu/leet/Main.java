package edu.leet;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the minimumPasses function below.
    static long minimumPasses(long m, long w, long p, long n) {
        long result = 0, count = 0;
        boolean isWorker = false;
        while(result < n) {
            count++;
            result += m * w;
            if(result == n) {
                break;
            }
            if((m * w) < (n / 2)) {
                while(result - p > p) {
                    result -= p;
                    if(isWorker) {
                        w++;
                        isWorker = false;
                    } else {
                        m++;
                        isWorker = true;
                    }
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long result = minimumPasses(3, 1, 2, 12);
        System.out.println(result);
    }
}