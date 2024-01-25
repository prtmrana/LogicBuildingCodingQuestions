package StringsRelatedSolution;

import java.util.Scanner;

public class FindASCIIvalue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input any string");
        String str=sc.next();
        int l=str.length();
        for(int i=0;i<l;i++){
            if((int)str.charAt(i)>=65 || (int)str.charAt(i)<=124){
                System.out.println("ASCII Value of the character "+str.charAt(i)+" in the given string is--"+(int)str.charAt(i));
            }
        }
    }
}
