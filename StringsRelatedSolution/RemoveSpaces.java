package StringsRelatedSolution;
                               //Remove spaces from a string//////
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("input a String");
        String str=sc.nextLine();
        String ctr="";
        int l=str.length();
        int count=0;
        for(int i=0;i<l;i++){
            if(str.charAt(i)!=' ')
              {
                  ctr+=str.charAt(i);
              }
              else
                  count++;
        }
        System.out.println("String without spaces is--"+ctr);
        System.out.println("number of spaces are---"+count);
    }
    
}
