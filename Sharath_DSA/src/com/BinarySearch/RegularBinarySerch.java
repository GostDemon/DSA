package com.BinarySearch;

public class RegularBinarySerch {
    public static void main(String[] args) {
        int[] arr ={11,33,55,57,59,67,87,94,98};
        int target = 87;
        System.out.println(binarySearchRegualr(arr,target));

    }
    static int binarySearchRegualr(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<= end){
            int mid = (start+end)/2;
            /*if(target==arr[mid]){
                return mid
            }*/
            // we are writing for assending order array
            if(target<arr[mid]){
             end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}




