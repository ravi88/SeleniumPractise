package arrays;

public class ReturntypOvrloding {
	int method1(int a)
	{
		System.out.println("normal method");
		return a;
	}

	String method1(int a,String b)
	
	{
		System.out.println("overloaded method");
		
		return b;
	}
	public static void main(String[] args) 
	{ 
	
ReturntypOvrloding r= new ReturntypOvrloding();

System.out.println(r.method1(44,"ravi"));

	}

	

}
