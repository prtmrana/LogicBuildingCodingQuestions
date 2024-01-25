package StringsRelatedSolution;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("input a String");
        String str=sc.next();
        String ctr=str.toLowerCase();
        int l=str.length();
        for(int i=0;i<l;i++){
            if((int)ctr.charAt(i)>=97 || (int)ctr.charAt(i)<=124){
                char ch=ctr.charAt(i);
                if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'){
                    
                }
            }
        }
    }
}
