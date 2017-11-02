package arrays;

public class BigIn_array {

	public static void main(String[] args) {
		int arr[]={12,44,6,99,107};
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big=arr[i];        
			}
		}
		
			System.out.println("biggest element in the array " +big);
	}
	
}
