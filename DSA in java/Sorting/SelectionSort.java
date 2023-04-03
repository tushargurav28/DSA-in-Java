import java.util.*;
public class SelectionSort {

  public static void PrintArray(int arr[]){
    for(int i = 0 ; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
  }  
  public static void SelectionSort(int arr[]){

    for(int i = 0; i<arr.length -1;i++)
    {
        int smallest = i;
        for(int j=i+1;j<arr.length -1;j++)
        {
            if(arr[smallest] > arr[j])
            {
                smallest = j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }
    PrintArray(arr);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int []arr = new int[size];

    // *********   input array ***********
    System.out.println("Enter array : ");

    // *******   input loop ************
    for(int i = 0; i<size;i++){
        arr[i] = sc.nextInt();
    }
    SelectionSort(arr);
  }
}
