import  java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int decimalnum=scan.nextInt();
        String binary=decimalToBinary(decimalnum);
        System.out.println("BInary num:"+binary);
    }
    public static String decimalToBinary(int decimalnum)
    {
        StringBuilder binary=new StringBuilder();
        int num=decimalnum;
        while(num>0)
        {
            int bit=num&1;
            binary.append(bit);
            num>>=1;
        }
        return binary.toString();
    }
}