public class SecondLArgestElement {

    public static void  main(String args[])
    {
         int [] arr={21,1,19,34,67,115,76};
         int first_max=0,second_max=0;
         for(int i=0;i<arr.length;i++)
         {
            if(first_max<arr[i])
            {
                second_max=first_max;
                first_max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=first_max)
            {
                second_max=arr[i];
            }
            System.out.println("First"+first_max+"Second"+second_max);
         }
         System.out.println("First Largest"+first_max);
         System.out.println("Second Largest: "+second_max);
    }
}
