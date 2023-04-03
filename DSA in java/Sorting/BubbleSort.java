 import java.util.*;
 class BubbleSort{
	public static void PrintArry(int arry[])
	{ for(int i =0; i<arry.length;i++)
                {
                        System.out.print(arry[i] +"  ");
                }
	}

	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter size of array : " );
		 int size = sc.nextInt();
		 int arr[] = new int[size];

		 System.out.print("Enter array : ");

		 // *********    input    *********
		 for(int i = 0; i<arr.length;i++){
			 arr[i] = sc.nextInt();
		 }

		 //Bubble sort
		 for(int i = 0; i<arr.length -1; i++){
			 for(int j = 0; j<arr.length -i -1;j++){
				 int temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
			 }
		 }
		 PrintArry(arr);
	 }
 }

