package practise_java;
class Student implements Cloneable
{
	String  StudentName;
	int rollNum;
	Student(String StudentName,int rollNum)
	{
		this.rollNum=rollNum;
		this.StudentName=StudentName;		
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Clone {

	public static void main(String[] args) {
	try{
		Student s1= new Student("ravi", 111);
		
			Student s2=(Student)s1.clone();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1.StudentName+ " " +  s1.rollNum);
			System.out.println(s2.StudentName+" " +s2.rollNum);
		
		} catch (CloneNotSupportedException e)
		{
			
			e.printStackTrace();
		}
		

}
}
