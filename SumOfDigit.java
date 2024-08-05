import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            int mod_num=num%10;
            num=num/10;
            sum+=mod_num;
        }
        System.out.println("Sum of digit "+sum);
        sc.close();
    }
}
