package com.core.common.java;

import org.apache.logging.log4j.util.Strings;

public class Alphabet {


    public static void main(String[] args) {

        String input="abc123xyz@555";
        char[] ch=input.toCharArray();
        String output="";
        String output2="";

        for (int i=0;i<ch.length;i++) {
            if(ch[i]>='a' && ch[i]<='z'){
                System.out.println(ch[i]+" is an alphabet");
                if(Strings.isNotEmpty(output) && Character.isDigit(output.charAt(output.length()-1))) {
                    output2=ch[i]+output2;
                    continue;
                } else {
                    output=ch[i] + output;
                }
            } else  if(Strings.isNotEmpty(output2)) {
                output=output+output2;
                output2= "";
            }
            else if(ch[i]>='0' && ch[i]<='9') {
                System.out.println(ch[i]+" is a number");
                output=output+ch[i];
            } else {
                System.out.println(ch[i] + " is a special char");
                output = output + ch[i];
            }

        }
        System.out.println("Output::"+output);

    }
}
