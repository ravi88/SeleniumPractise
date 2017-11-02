package practise_java;

public class Pattern_R {

	public static void main(String[] args) {
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(i==2||j==3&&i!=1&&i==3||j==4&&i!=3||j==0&&i!=0||(i<=0&&j<4))
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
