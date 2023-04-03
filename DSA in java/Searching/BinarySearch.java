/* 
code author : Tushar Gurav
This is BinarySearch program Take input form user
Sorted array and find Element 

*/




import java.util.Scanner;

public class BinarySearch {
    public int BinarySearch(int arr[], int size , int key) {
        int start = 0;
        int end = size -1  ;
        int mid = (start  + end) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid] ) {
                start = mid + 1;
            } else {
                end =  mid -1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
// **************************   size of array     *************************
        System.out.print("Enter size of array  :");
        int size = sc.nextInt();
        int arr[] = new int[size];

// **************************   input array     *************************
    System.out.print("Enter the array "+size+":");
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
// **************************   size of array     ************************
        System.out.print("Enter key : ");
        int key = sc.nextInt();
    BinarySearch ob = new BinarySearch();
    int result = ob.BinarySearch(arr,size,key);



        //        int result = BinarySearch(arr,size , key);
        if (result == -1)
        {
            System.out.println("Key not found ");
        }else {
            System.out.println("key is found at " + (result +1)+" index");
        }
    }

}
