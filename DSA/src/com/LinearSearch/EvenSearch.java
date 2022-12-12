package com.LinearSearch;

public class EvenSearch {
    public static void main(String[] args) {
        int[] numbers = {22,34,454,546,567,2435,5675,567,25};
        System.out.println(evenSearch(numbers));


    }
    // write a function to find how many digits in the number
    static int digitsSearch(int[] numbers){
        int count =0;
        for (int num : numbers){
            num = num /10;
            count++;
            return num;
        }
        return -1;
    }
    static boolean evenSearch(int[] numbers){
        for (int num : numbers){
        int ans =    digitsSearch(numbers);
            if(ans % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
