                          //Count number of vowels, consonants, spaces in String

package StringsRelatedSolution;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a string");
        //String str=sc.next();
        String str=sc.nextLine();
        int vowels=0,consonants=0,countSpaces=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 || (int)str.charAt(i)<=124 || str.charAt(i)==' ' ){
            if(str.charAt(i)==' ')
               countSpaces++;
            else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' 
                || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'  )  
                vowels++;
            else 
               consonants++; 
            }
            else 
              System.out.println("nothing");

           
        }
        System.out.println("vowels_count=="+vowels+"   consonant_counts=="+consonants+"   spaces_counts=="+countSpaces);
    }
    
}
