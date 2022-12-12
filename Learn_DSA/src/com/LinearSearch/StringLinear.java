package com.LinearSearch;

public class StringLinear {
    public static void main(String[] args) {
        String naName = "sharath chandra";
        char searcCheyanlsindi = 't';
       // System.out.println(search(naName,searcCheyanlsindi));
        System.out.println(search2(naName,searcCheyanlsindi));
    }
    //write a function to search the string with the charactoer given
    static boolean search(String naName, char searcCheyanlsindi){
      if(naName.length() == 0){
          return false;
      }
      for (int i=0;i<naName.length();i++){
          if(naName.charAt(i) == searcCheyanlsindi){
              return true;
          }
      }
        return false;

    }
    static boolean search2(String naName,char searcCheyanlsindi){
        if(naName.length() == 0){
            return false;
        }
        for (char see : naName.toCharArray()){
            if(searcCheyanlsindi == see){
                return true;
            }

        }
        return false;
    }



}
