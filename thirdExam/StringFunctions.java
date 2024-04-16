package thirdExam;

public class StringFunctions 
{

	public static void main(String[] args) 
	{
		String s = "Spandana";
		String s1= " spandana gunnam ";
		System.out.println(s.charAt(3));
		System.err.println(s.length());
		System.out.println(s.toUpperCase());
		System.err.println(s.toLowerCase());
		System.out.println(s.indexOf("a"));
		System.err.println(s.equals(s));
		System.out.println(s.contains(s));
		System.err.println(s.substring(3));
		System.out.println(s.substring(2, 4));
		System.err.println(s.concat(" gunnam")); 
		System.out.println(s1.trim());
	}

}
