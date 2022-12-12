package com.BinarySearch;

public class BinaryUnknow {
    public static void main(String[] args) {
        int[] arr = {4,6,8,9,10,22,45,67};
        int target =22;
        int ans = binaryAscDesc(arr,target);
        System.out.println("the target index is : " + ans);
    }
    static int binaryAscDesc(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(target==mid){
                return mid;
            }
            boolean isAsc;
            if(arr[start]<arr[end]){
                isAsc=true;
            }else {
                isAsc=false;
            }
            if(isAsc){
                if(target<arr[mid]){
                        end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}

