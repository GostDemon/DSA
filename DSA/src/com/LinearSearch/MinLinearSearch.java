package com.LinearSearch;

public class MinLinearSearch {
    public static void main(String[] args) {
        int[] arr = {33334,43,565,67,667967,234,234,4,65,34};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
