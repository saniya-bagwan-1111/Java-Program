import java.util.*;

public class FibonaccieSeries{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int num=sc.nextInt();
        int a=0,b=1;
        for (int i=2;i<num;i++){
            int n=a+b;
            System.out.println(a+"+"+b+"="+ n);
            a=b;
            b=n;
        }
        System.out.println("\n");
        sc.close();
    }
}