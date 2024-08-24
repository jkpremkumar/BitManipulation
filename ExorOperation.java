 import  java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int a=1,b=2;
        System.out.print(a);
            for(int i=1;i<num;i++)
            {
                int next=a^b;
                System.out.print(next);
                a=b;
                b=next;
            }
    }
}