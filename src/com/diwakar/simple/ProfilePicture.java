/*******************************************************************************
 * Author : Diwakar Shukla
 * 1/7/21, 12:09 PM
 *
 ******************************************************************************/

package com.diwakar.simple;

import java.util.Scanner;

public class ProfilePicture {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int threshHold = Integer.parseInt(scanner.next());
        int numberOfPhotos = Integer.parseInt(scanner.next());
        solution(scanner, threshHold, numberOfPhotos);


    }

    public static void solution(Scanner scanner, int threshHold, int photos) {

        while (photos > 0) {
            int l1 = Integer.parseInt(scanner.next());
            int l2 = Integer.parseInt(scanner.next());

            if (threshHold == l1 && threshHold == l2) {
                System.out.println("ACCEPTED");
            } else if (l1 == l2 && (l1 > threshHold && l2 > threshHold)) {
                System.out.println("ACCEPTED");

            } else if (threshHold < l1 && threshHold < l2) {
                System.out.println("CROP IT");
            } else {
                System.out.println("UPLOAD ANOTHER");
            }
            photos--;
        }


    }
}
