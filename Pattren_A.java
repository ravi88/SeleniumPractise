package practise_java;

public class Pattren_A {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
		for(int j=0;j<5;j++)
		{
			if(i==0&&j!=0&&j!=4||j==0&&i!=0||i==2||j==4&&i!=0)
			{
				System.out.print("* ");
			}
			else{
				System.out.print("  ");
			}
		}
	System.out.println("");
	}

	}

}
