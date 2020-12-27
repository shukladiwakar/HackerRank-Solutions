package com.diwakar.simple;

import java.io.*;
import java.util.*;

class SplitHouses {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int grid = Integer.parseInt(scanner.nextLine());
        String house = scanner.nextLine();
        solution(grid, house);


    }


    public static void solution(int testCases, String house) {

        char[] chars = house.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                chars[i] = 'B';
            }
        }
        String ans = "YES";
        for (int i = 0; i < chars.length - 1; i++) {
            if ((chars[i] == chars[i + 1]) && (chars[i] == 'H')) {
                ans = "NO";
            }
        }
        if (ans.equals("NO")) {
            System.out.println("NO");
        }
        if (ans.equals("YES")) {
            System.out.println(ans);
            System.out.println(String.valueOf(chars));

        }
    }
}
