import java.util.*;

class LargestElement{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Elements you want to add in array");
        int input=sc.nextInt();
        int arr[]=new int[input];
        System.out.println("Please Enter"+input+" inputs");
        for(int i=0;i<input;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Entered Input");
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            if(max < arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println();
        System.out.println("Largest element "+max);
    }
}