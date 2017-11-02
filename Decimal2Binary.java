package practise_java;

public class Decimal2Binary {

	public static void main(String[] args) {
	int decimal =10;
	int copy = decimal;
	String binary="";
	while(decimal>0)
	{
		int rem=decimal%2;
		binary=rem+binary;
		decimal=decimal/2;
	}
System.out.print(binary);
	}

}
