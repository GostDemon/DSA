package com.BinarySearch;

import java.util.Arrays;

public class FistLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,4,4,5,6,7,8,9,10,11,12};
        int target = 4;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[] arr, int target){
        int[] ans ={-1,-1};
        int start = res(arr,target,true);
        int end = res(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
  static  int res(int[] arr, int target, boolean leftRight){
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while (start<=  end){
            int mid =(start+end)/2;
            if(target<arr[mid]){
                end= mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else {
                 ans = mid;
                 if(leftRight){
                     end=mid-1;
                 }else {
                     start=mid+1;
                 }
            }
        }
        return ans;
    }
}
// the maihn thg
