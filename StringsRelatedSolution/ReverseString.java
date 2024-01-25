package StringsRelatedSolution;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("input a String");
        String str=sc.nextLine();
        // String ctr="";
        // int l=str.length();
        // for(int i=0;i<l;i++){
        //     ctr+=str.charAt(l-i-1);
        // }
        // System.out.println("original string is---"+str);
        // System.out.println("reverseString is---"+ctr);
                                   //----------Using Stringbuilder class---------------
        /*StringBuilder sBuilder=new StringBuilder(str);
        sBuilder.reverse();
        String reverseString=sBuilder.toString();
        System.out.println("reverse string is--"+reverseString);*/

                                //------------UsING STACK data structure----------------

        Stack stringStack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stringStack.push(str.charAt(i));
        }

        System.out.println("reverse string is----");
        for(int i=0;i<str.length();i++){
            System.out.print(stringStack.pop());
        }
            
        }

}
