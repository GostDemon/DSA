package com.PractiveLinear;

public class FindMinValueLinear {
    public static void main(String[] args) {
        int[] arr = {34,25,56,67,23,1,4347,7,4356,7,34};
        System.out.println(minValuefind(arr));

    }
    // write a function to find the minimun value in the
    static int minValuefind(int[] arr){
        int minvalu = arr[0];
        for (int num : arr){
            if(num<minvalu){
                minvalu = num;
            }
        }
        return minvalu;
    }
}
