package com.BubbleSort;

import java.util.Arrays;

public class BasicBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,8,3,2,9,4,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // lets wrtire a function which will sory the given array in bubble
    static void bubbleSort(int[] arr){
        //here we use for each loop i and j for sorting the bulle
        // i is for the outer loop and j is for the inner loop
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
