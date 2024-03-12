import java.util.Scanner; 
 
class arrays
{ 
	public static void main(String[] args)
	{ 
		int arr[] = new int[10];	 
		Scanner scan = new Scanner(System.in); 
		 
		System.out.println("Enter the elements of the array:\n"); 
 
		//Taking input 
		for(int i = 0; i<10; i++
		){ 
			arr[i] = scan.nextInt();
		} 
 
		System.out.println("The elements of the array are:"); 
		//Printing out 
		for(int i = 0; i<10; i++)
		{ 
			System.out.println("arr[" + i + "] = " + arr[i]); 
		} 
	} 
} 