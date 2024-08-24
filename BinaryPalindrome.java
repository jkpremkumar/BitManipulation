import  java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(isBinaryPalindrome(num))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }
    public static boolean isBinaryPalindrome(int num)
    {
        String binaryString=Integer.toBinaryString(num);
        int start=0;
        int end=binaryString.length()-1;
        while(start>end)
        {
            if(binaryString.charAt(start)!=binaryString.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}