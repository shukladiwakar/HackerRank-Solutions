package com.diwakar.simple;


import java.util.Scanner;

class TrainSeatingArrangement {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        solution(scanner, testCases);


    }

    public static void solution(Scanner scanner, int testCases) {
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int rem = n % 12;
            switch (rem) {
                case 0:
                    System.out.println((n - 11) + " WS");
                    break;
                case 1:
                    System.out.println((n + 11) + " WS");
                    break;
                case 2:
                    System.out.println((n + 9) + " MS");
                    break;
                case 3:
                    System.out.println((n + 7) + " AS");
                    break;
                case 4:
                    System.out.println((n + 5) + " AS");
                    break;
                case 5:
                    System.out.println((n + 3) + " MS");
                    break;
                case 6:
                    System.out.println((n + 1) + " WS");
                    break;
                case 7:
                    System.out.println((n - 1) + " WS");
                    break;
                case 8:
                    System.out.println((n - 3) + " MS");
                    break;
                case 9:
                    System.out.println((n - 5) + " AS");
                    break;
                case 10:
                    System.out.println((n - 7) + " AS");
                    break;
                case 11:
                    System.out.println((n - 9) + " MS");
                    break;

            }
        }
        }

    }
