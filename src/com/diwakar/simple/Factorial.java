package com.diwakar.simple;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        System.out.println(solution(testCases));


    }

    public static int solution(int number) {
        int result = 1;
        if (number == 0)
            return 1;
        result = number * solution(number - 1);
        return result;
    }
}
