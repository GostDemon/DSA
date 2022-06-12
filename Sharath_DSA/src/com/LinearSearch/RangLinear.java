package com.LinearSearch;

public class RangLinear {
    public static void main(String[] args) {
        int arr[] = {22,33,44,55,66,77};
        int targer = 55;
        int ans = search(arr,targer,1,4);
        System.out.println(ans);

    }
    static int search(int arr[], int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i =start;i<=end;i++){
            int index = arr[i];
            if(index==target){
                return i;
            }
        }
        return -1;
    }
}

