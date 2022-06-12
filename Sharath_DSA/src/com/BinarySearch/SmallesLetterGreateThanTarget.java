package com.BinarySearch;

public class SmallesLetterGreateThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'j' };
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        // since we do not want the target answer. we are not supposed
        // to keep the <= symbol in while loop
        while (start < end) {
            int mid = (start + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
