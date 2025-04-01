package com.core.common.stringDsa;

public class LargestOddNum {
    public static  String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1)
            return num;

        for(int i=num.length()-1;i>=0;i--) {
            int n=num.charAt(i);
            if(n%2==1) {
                return num.substring(0,i+1);
            }
        }

        return "";

    }
    public static void main(String[] args) {
        //System.out.println(largestOddNumber("52"));
        String num="19";
        //System.out.println(num.charAt(num.length()-1));
       for(int i=num.length()-1;i>=0;i--){
            int n=num.charAt(i);
            System.out.println(n);
        }
        //System.out.println(findLargestOddNum("530"));
      //  System.out.println(largestOddNumber("530"));
    }

    public static String findLargestOddNum(String num){
        System.out.println("in findLargestOddNum()::"+num);
        if((int)num.charAt(num.length()-1)%2==1){
            return num;
        }
        for(int i=num.length()-1;i>=0;i--){
           int n=num.charAt(i);
            System.out.println(n);
           if(n%2==1){
               System.out.println("returning::"+num.substring(0,i+1));
               return  num.substring(0,i+1);
           }

        }
        return "";
    }


}
