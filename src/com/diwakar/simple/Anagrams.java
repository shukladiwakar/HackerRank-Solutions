package com.diwakar.simple;

import java.util.*;

class Anagrams {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        solution(testCases);


    }

    public static void solution(int testCases) {
        Scanner scanner = new Scanner(System.in);
        while (testCases > 0) {
            String str1 = scanner.next();
            String str2 = scanner.next();

            System.out.println(remAnagram(str1, str2));
            testCases--;
        }
    }

    public static int remAnagram(String str1, String str2) {
        int count1[] = new int[26];
        int count2[] = new int[26];
        for (int i = 0; i < str1.length(); i++)
            count1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < str2.length(); i++)
            count2[str2.charAt(i) - 'a']++;

        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                    count2[i]);
        return result;
    }

   /* public static int countDistinct(ArrayList<Character> characterArrayList1, ArrayList<Character> characterArrayList2) {

        int counter = 0;
        for (int i = 0; i < characterArrayList1.size(); i++) {
            if (!characterArrayList2.contains(characterArrayList1.get(i))) {
                counter++;
            }
        }


        return counter;
    }

    public static ArrayList<Character> getCharList(String str) {
        char[] chars = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            arrayList.add(chars[i]);
        }

        return arrayList;
    }


    */
}
