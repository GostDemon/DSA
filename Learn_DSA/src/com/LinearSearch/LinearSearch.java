package com.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
    boolean ans = innerSearch("sharath", 'u');
        System.out.println(ans + " at the index "   );
    }
    static boolean innerSearch(String str, char search){
        if (search ==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            char vundhi = str.charAt(i);
            if (vundhi == search){
                return true;
            }
        }
    return false;
    }


}
