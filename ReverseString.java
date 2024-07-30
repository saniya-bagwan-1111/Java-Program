import java.util.*;
 

public class ReverseString{
    public static void usingforLoop(String inputstring)
    {
        //To store reversed string in some variable
        String revese="";
        
        for(int i=inputstring.length()-1;i>=0;i--)
        {
            //System.out.print(inputstring.charAt(i));
            revese=revese+inputstring.charAt(i);
        }
        System.out.println("Input String-"+inputstring);
        
        System.out.println("Reverse String-"+revese);

    }
    public static void usingStringBuilderclass(String inputstring)
    {
        String reverse=new StringBuilder(inputstring).reverse().toString();
        System.out.println("Using StringBuilder"+reverse);
    }
    public static void main(String args[])
    {
        String inputstring;
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        inputstring=sc.nextLine();
        usingforLoop(inputstring);
        usingStringBuilderclass(inputstring);
    }
}