package com.diwakar.simple;

import java.util.Scanner;

class CostOfBallons {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        solution(scanner, testCases);
    }

    public static void solution(Scanner scanner, int testCases) {
        for (int i = 0; i < testCases; i++) {
            int costOfGreen = scanner.nextInt();
            int costOfPurple = scanner.nextInt();
            int numberOfParticipant = scanner.nextInt();
            int firstProblemSolved = 0;
            int secondProblemSolved = 0;

            for (int j = 0; j < numberOfParticipant; j++) {
                int t1 = scanner.nextInt();
                int t2 = scanner.nextInt();
                if (t1 == 1) {
                    firstProblemSolved++;
                }
                if (t2 == 1) {
                    secondProblemSolved++;
                }
            }
            int case1 = costOfGreen * firstProblemSolved + costOfPurple * secondProblemSolved;
            int case2 = costOfGreen * secondProblemSolved + costOfPurple * firstProblemSolved;
            System.out.println(Math.min(case1, case2));
        }
    }
}
