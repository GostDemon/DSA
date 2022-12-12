package com.LinearSearch;

import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        int arr[][] = { {5,2,3,4},
                        {1,2,5,6,7,8},
                        {9,10,11,12,99,78},
                        {3,45,34,22,233,2}
                       };
        int target = 233;
        int ans[] = search2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int arr[][], int target){
        // iterate through the 2d array
        for(int row =0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
   return new int[]{-1,-1};
    }
}
