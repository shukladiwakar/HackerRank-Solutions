package com.diwakar.code_monk;

import java.util.Scanner;

public class CycleShift {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        solution(scanner, testCases);

     /*   System.out.println(binaryToDecimal(
                new char[]{'1', '0', '1', '0', '1'}));
*/
    }

    public static void solution(Scanner scanner, int testCases) {
        while (testCases > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            int k = scanner.nextInt();

            String str = scanner.nextLine();
            char chars[] = str.toCharArray();
            int counter =0;
            for(int i=0;i<n;i++){

           }

            testCases--;
        }
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
