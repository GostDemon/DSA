package com.BinarySearch;

public class BinnaryAscDesc {
    public static void main(String[] args) {
      //  int[] arr ={11,33,55,57,59,67,87,94,98};
        int[] arr = {99,97,87,75,66,54,49,33,29,11};
        int target = 20;
        System.out.println(findAscDescBinary(arr,target));
    }
    static int findAscDescBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find which order is array
        boolean isAsc;
        if (arr[start] <= arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        if (isAsc) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            }else if (isAsc==false){
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (target < arr[mid]) {
                        start = start + 1;
                    } else if (target > arr[mid]) {
                        end = mid + 1;
                    } else
                        return mid;
                }
            }
        return start;
    }
}


