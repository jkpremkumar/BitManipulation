import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if((n&1)==0){
            System.out.println("Off");
        }
        else{
            System.out.println("On");
        }
    }
}