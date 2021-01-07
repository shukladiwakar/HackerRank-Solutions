package com.diwakar.code_monk;

import java.util.Scanner;

public class CycleShift {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        solution(scanner, testCases);

    }

    public static void solution(Scanner scanner, int testCases) {
        while (testCases > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            String str = scanner1.nextLine();
            int counter = 0;
            int max = 0;
            boolean found = true;
            String str1 = str;
            for (int i = 0; i < n - 1; i++) {
                char[] ch = rotateArray(str.toCharArray(), n);

                int sum = binaryToDecimal(ch);
                if (sum > max) {
                    max = sum;
                }
            }
            int reached = 0;
            while (found) {
                char [] ch1 = rotateArray(str.toCharArray(), n);
                counter++;
                if (binaryToDecimal(ch1) == max) {
                    reached = reached + 1;
                    System.out.println("reached : " + reached);
                    if (reached == k) {
                        System.out.println(counter);
                        found = false;
                    }
                }
            }
            testCases--;
        }
    }


    public static char[] rotateArray(char[] chars, int n) {
        char[] temp = new char[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = chars[i];
        }
        temp[n - 1] = chars[0];
        return temp;
    }

    public static int binaryToDecimal(char[] chars) {
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                sum = (int) (sum + Math.pow(2, i));
            }
        }
        return sum;
    }
}
