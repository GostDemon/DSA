package com.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7,9,15,22,18,9, 6, 3, 2};
        int ans = peakIndexSearch(arr);
        System.out.println(ans);

    }

    static int peakIndexSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return arr[start];
    }
}
