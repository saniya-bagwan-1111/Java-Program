import java.util.*;
public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int [] result= Arrays.stream(numbers).distinct().toArray();
        System.out.println("After duplicate Removable"+Arrays.toString(result));      
    }
    
}
