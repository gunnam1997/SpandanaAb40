package thirdExam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
	public static void main(String[] args)
	{
		try 
		{
			Scanner s1=new Scanner(System.in);
			int c=1/s1.nextInt();
			System.out.println("try Block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("I have handled one exception called AE");
		}
		catch(NullPointerException a2)
		{
			System.out.println("I have handled one exception called NPE");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("I have handled one exception called IMME");
		}
		catch(ArrayIndexOutOfBoundsException a4)
		{
			System.out.println("I have handled one exception called AIOOBE");
		}
		finally
		{
			System.out.println("Here you can keep some common action no matter exception occured or not");
		}

	}

}
