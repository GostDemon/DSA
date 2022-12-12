package com.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,10,33,56,45,20,15,3,1};
         int target = 3;
         int answer = search(arr,target);
        System.out.println(answer);


    }
    static int search(int[] arr, int target){
        int peak = peakNumber(arr);
        int firstTry = assendingBinary(arr, target);
        int lastTry = decendingBinary(arr,target);
        if(firstTry != -1){
            return firstTry;
        }else{
            return lastTry;
        }
    }

    // writing a function to find the peak element in the Mountain Array
    static int peakNumber(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
    static int assendingBinary(int[] arr,int target){
        int start =0;
        int end = peakNumber(arr);
        while (start<=end){
            int mid =(start+end)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    static  int decendingBinary(int[] arr, int target){
        int start = peakNumber(arr)+1;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<target){
                end = mid-1;
            }else if (arr[mid]>target){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
