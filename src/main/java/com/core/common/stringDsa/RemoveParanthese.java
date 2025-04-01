package com.core.common.stringDsa;

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;

public class RemoveParanthese {

    public static void main(String[] args) {

         //String input="(()())(())";
        String input = "(()())(())(()(()))";
        //String input="()()";
        //System.out.println("Output::"+removeOuterParentheses(input));
        //System.out.println("reverse word::"+reverseWords("a good   example"));
        //System.out.println("largest Odd Num"+largestOddNumber("52"));
        System.out.println("largest Odd Num::"+largestOddNumber_pass("10133890"));

//        int count = 0;
//        String str = "";
//        for (int i = 0; i < input.length(); i++) {
//
//            if (input.charAt(i) == ')') {
//                count++;
//                str = str + ")";
//            } else if (input.charAt(i) == '(') {
//                count--;
//                str = str + "(";
//            }
//            if (count == 0 && i < input.length() - 1) {
//                str = str + "+";
//            }
//        }
//        System.out.println("Primitive decomposition::" + str);
//
//        StringBuffer sb = new StringBuffer(str);
//        sb = sb.delete(0, 1);
//        sb = sb.delete(str.length() - 2, str.length() - 1);
//        str = sb.toString();
//        //sb=new StringBuffer(str);
//        System.out.println("Before loop::"+sb);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '+') {
//                sb = sb.deleteCharAt(i - 1);
//                sb = sb.deleteCharAt(i);
//                System.out.println(i+"===="+sb);
//            }
//            str=sb.toString();
//        }
//        str = sb.toString().replace("+", "");
//        System.out.println("After Removing Parantheses::" + str);
    }

    public static String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] str = s.split("\\s");
        System.out.println(Arrays.toString(str));
        for (int i = str.length - 1; i >= 0; i--) {
            if(Strings.isNotEmpty(str[i])){
                result.append(str[i] + " ");
            }
        }
        return result.toString();
    }

    public static String largestOddNumber(String num) {
        int max=0;
        if(Integer.parseInt(num)%2!=0){
            return num;
        }
        String[] digit=num.split("");
        for(int i=0;i<digit.length;i++) {
            int n=Integer.parseInt(digit[i]);
            if(n>max && n%2!=0){
                max=n;
            }
        }
        return String.valueOf(max);
    }

    public static String largestOddNumber_pass(String num) {

        if((int)num.charAt(num.length()-1)%2==1)
            return num;


        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
