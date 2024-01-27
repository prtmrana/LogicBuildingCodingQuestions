package StringsRelatedSolution;

import java.util.Scanner;

/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a String");
        String str=sc.next();
        int l=str.length();
        String ctr="";
        for(int i=0;i<l;i++){
            ctr+=str.charAt(l-i-1);

        }
        if(str.equals(ctr))       // "==" compares the memory location of two objects, 
                                  //while "equals" compares the contents of two objects.
        System.out.println("string is palindrome");

        else 
        System.out.println("string is not palindrome");
    }
}


                    //------Using stringbuilder class------------------

                  /*  public class PalindromeCheck {
                        public static boolean isPalindrome(String str) {
                            StringBuilder sb = new StringBuilder(str);
                            return str.equals(sb.reverse().toString());
                        }
                    
                        public static void main(String[] args) {
                            String str = "madam";
                            System.out.println(isPalindrome(str)); // Output: true
                        }
                    }*/