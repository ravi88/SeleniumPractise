package practise_java;  //palindrome.

public class Revrse_Number {

	public static void main(String[] args) {
int number=555;
int rev=0;
int copy=number;
 while(number>0)
 {
	 int rem=number%10;
	 rev=rev*10+rem;
	 number=number/10;
 }
 System.out.println(rev);
 String msg=(copy==rev)?copy+" is palindrome":copy+" is not palindrome";

 System.out.println(msg);
 }


}
