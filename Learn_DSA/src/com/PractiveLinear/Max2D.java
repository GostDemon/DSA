package com.PractiveLinear;

public class Max2D {
    public static void main(String[] args) {
        int arr[][] = { {5,2,3,4},
                {111,2,5,6,7,8},
                {9,10,11,12,99,78},
                {3,45,34,22,233,2}
        };
        System.out.println(maxfindout2d(arr));
    }
    // write a function to find the maximum number in this 2d array
    static int maxfindout2d(int[][] arr){
        int maxNUmber = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>maxNUmber){
                    maxNUmber = arr[i][j];
                }
            }
        }
        return maxNUmber;
    }
}
