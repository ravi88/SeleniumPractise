package arrays;

public class Reverse_array {

	public static void main(String[] args) {
int arr[]={11,90,443,1,10};
for(int i=0;i<arr.length/2;i++)
{
	int temp=arr[i];
	arr[i]=arr[arr.length-1-i];
	arr[arr.length-1-i]=temp;
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
