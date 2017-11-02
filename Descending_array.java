package arrays;

public class Descending_array {

	public static void main(String[] args) {
		int []arr={2,0,33,44,5,20};
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])                     //arr[i]>arr[j] for ascending order
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}

	}
}
