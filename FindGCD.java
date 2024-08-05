public class FindGCD {//GCD-greatest common factor
    //ex 36, 24
    //36=2*2*3*3    24=2*2*2*3
    //GCD=2*2*3=12
    
    public static void main(String args[])
    {
        int a=36;
        int b=24;
        
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
            System.out.println(a + " "+ b);
        }
        System.out.println("GCD "+a);
    }
    
}
