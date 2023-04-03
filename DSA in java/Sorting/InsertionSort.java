import java.util.Scanner;

public class InsertionSort{

    public static void PrintArry(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+ " ");
         }
     }
    public static void main(String args[])
    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int []arr = new int[size];

        for(int i =0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 1 ; i<arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            for(; j >=0;j--){
                if(arr[j] > temp)
                {
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
        PrintArry(arr);
    }
}