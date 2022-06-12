package com.BinarySearch;

public class SealingBinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 15;
        int ans1 = cealingSearch(arr,target);
        System.out.println(ans1);
        int ans2 =flooringSearch(arr,target);
        System.out.println(ans2);

    }

    // find the target of great than number of target
    // when the loop is vioalated when start is greater than end... so then anser is start
    static int cealingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return arr[start];
    }
// when the loop is vioalated then the start is grater than end... so the ansere is end
    static int flooringSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return arr[end];
    }
}
