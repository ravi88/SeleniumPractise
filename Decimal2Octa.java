package practise_java;

public class Decimal2Octa {

	public static void main(String[] args) {
int decimal=700;
int copy=decimal;
String octa="";
 while(decimal>0)
 {
	 int rem=decimal%8;
	 octa=rem+octa;
	decimal= decimal/8;
	 
 }
 System.out.println(octa);
	}

}
