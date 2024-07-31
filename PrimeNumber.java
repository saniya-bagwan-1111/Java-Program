import java.util.*;

public class PrimeNumber{
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int num=sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<=num/2;i++){
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num+"is  a prime");
        }
        else{
            System.out.println(num+"is not prime number");
        }
        sc.close();
    }
}