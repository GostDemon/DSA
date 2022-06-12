package com.PractiveLinear;

public class RegLinearSearch {
    public static void main(String[] args) {
        int[] arr = {34,35,56,354,446,67,3445,467,78,45,34,6};
        int target = 78;
        System.out.println("the number is at the inde " + findNumber(arr,target));
    }
    //write a function to find the number iin the array
    static int findNumber(int[] arr, int target){
        for (int i=0;i<arr.length;i++){

            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
