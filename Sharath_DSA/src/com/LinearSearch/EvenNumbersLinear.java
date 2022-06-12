package com.LinearSearch;

public class EvenNumbersLinear {
    public static void main(String[] args) {
        int[] nums = {34,546,34534,5645,32523,6445,343,343,234,2342,2};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count =0;
        for (int num : nums) {
            if(evenFind(num) %2 == 0){
                count++;
            }
        } 
        return count;
    }
    static int evenFind(int num){
        int count =0;
            while (num > 0){
                count++;
                num = num/10;
            }
        return count;
        }


    }

