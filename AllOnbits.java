import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}