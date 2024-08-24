import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int n=scan.nextInt();
    int[] arr=new int[a];
    for(int i=0;i<a;i++){
      arr[i]=scan.nextInt();
    }
    int result=0;
    for(int num:arr){
      if(num%n==0){
        result |=num;
      }
    }
    System.out.println(result);
  }
}