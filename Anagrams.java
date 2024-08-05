import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    boolean CheckAnagrams(String S1_Str,String S2_Str)
    {
        if(S1_Str.length() != S2_Str.length())
        {
            return false;
        }
        else{
            char[] ch1=S1_Str.toCharArray();
            char ch2[]=S2_Str.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println("After Coverting into char and sorting String 1 : "+Arrays.toString(ch1)+" String 2 : "+Arrays.toString(ch2));
            return Arrays.equals(ch1, ch2);
        }
    
    }
    public static void main(String[] args) {
        String str1="slient";
        String str2="listen";
        Anagrams a=new Anagrams();
        if(a.CheckAnagrams(str1, str2))
        {
            System.out.println("Both are anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
    }    
}
