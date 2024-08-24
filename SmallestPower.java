import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    long a=scan.nextLong();
    int pow=1;
    while(pow<a){
      pow<<=1;
    }
    System.out.println(pow);
  }
}