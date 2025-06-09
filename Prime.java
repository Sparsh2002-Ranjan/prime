import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean b=false;
        for(int i=0;i<a/2;i++){
            if(a%i==0){
                b=true;
                break;
            }
        }
        if(b==true)System.out.print("not a prime no.");
        else System.out.print("prime no.");
    }
}