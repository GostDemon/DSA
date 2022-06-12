package com.PractiveLinear;

public class MaxValueFind {
    public static void main(String[] args) {
        int[] arr = {34,25,56,67,23,1,4347,7,4356,7,34};
        System.out.println(maxValuefind(arr));

    }
    // write a function to find the minimun value in the
    static int maxValuefind(int[] arr){
        int manvalu = arr[0];
        for (int num : arr){
            if(num>manvalu){
                manvalu = num;
            }
        }
        return manvalu;
    }
}

