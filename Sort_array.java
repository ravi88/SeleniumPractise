package arrays;
public class Sort_array {                                               

	public static void main(String[] args) {
		int arr[]={55,3,2,0,991,1};
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])                   //a[i]<a[j] for descending order(bubble sort technique)
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
