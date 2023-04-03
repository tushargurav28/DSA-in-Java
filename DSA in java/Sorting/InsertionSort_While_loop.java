import java.util.*;
public class InsertionSort_While_loop{
   
    public static void PrintArry(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+ " ");
         }
     }
   
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        
        int []arr = new int[size];

        for(int i = 0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Insertion sort

        for(int i =1; i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && temp < arr[j])
            {
                arr[j+1] = arr[j];
                j++;
            }
            arr[j+1] = temp;
        }

        PrintArry(arr);
    }
}