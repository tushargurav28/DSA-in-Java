import java.util.*;
class LinearSearch {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int number[] = new int[size];
		System.out.print("Enter an List of numbers "+size+" : ");
		
		// Taking a array as input
		for(int i = 0; i<size; i++){
			number[i] = sc.nextInt();
		}
		System.out.print("Enter a key : ");
		int key = sc.nextInt();


		// Output an array with out any search ;
		for (int i = 0; i<size;i++){
			System.out.print( number[i] +"  ");
		}
		System.out.println();
		// search a key in that array
		for (int i = 0; i<size;i++){
			if (key == number[i]){
				System.out.println("Key is found at this location : " + (i+1) );
			}
			else {
				counter ++;
			}
			}
		if( counter == size){
			System.out.println("Key is not found");

	}
	}
}
