package com.LinearSearch;

public class Max2d {
    public static void main(String[] args) {
        int arr[][] = { {5,2,3,4},
                {111,2,5,6,7,8},
                {9,10,11,12,99,78},
                {3,45,34,22,233,2}
        };
        int ans = maxSearch(arr);
        System.out.println(ans);
    }
    static int maxSearch(int arr[][]){
        int min = arr[0][0];
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
