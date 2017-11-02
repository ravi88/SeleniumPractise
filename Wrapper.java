package practise_java;

public class Wrapper {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = new StringBuffer("java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}