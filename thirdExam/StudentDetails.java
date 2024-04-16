package thirdExam;

public class StudentDetails {
	//method 1
	public static void main(String[] args) 
	{
		int rollNo[ ] = new int[5];
		rollNo[0]=1;
		rollNo[1]=2;
		rollNo[2]=3;
		rollNo[3]=4;
		String studentName[] = new String[5];
		studentName[0]="sai";
		studentName[1]="ram";
		studentName[2]="sita";
		studentName[3]="laksh";
		char gender[] = new char[5];
		gender[0]='m';
		gender[1]='m';
		gender[2]='F';
		gender[3]='m';
		long mobileNumber[] = new long[5];
		mobileNumber[0]=987654;
		mobileNumber[1]=234567;
		mobileNumber[2]=456789;
		mobileNumber[3]=234567;
		System.out.print("StudentName   "+ studentName[0]+"       "+studentName[1]+"      "+studentName[2]+"      "+studentName[3]);
		System.out.println();
		System.out.print("Gender        "+ gender[0]+"         "+gender[1]+"        "+gender[2]+"         "+gender[3]);
		System.out.println();
		System.out.print("MobileNumber  "+ mobileNumber[0]+"    "+mobileNumber[1]+"   "+mobileNumber[2]+"    "+mobileNumber[3]);
		System.out.println();
		System.out.print("RollNo        "+ rollNo[0]+"         "+rollNo[1]+"        "+rollNo[2]+"         "+rollNo[3]);
		System.out.println();
		System.out.println();
		studentData();
	}

	//method 2
	static void studentData() 
	{

		int rollNo[ ] = new int[5];
		rollNo[0]=1;
		rollNo[1]=2;
		rollNo[2]=3;
		rollNo[3]=4;
		String studentName[] = new String[5];
		studentName[0]="sai";
		studentName[1]="ram";
		studentName[2]="sita";
		studentName[3]="laksh";
		char gender[] = new char[5];
		gender[0]='m';
		gender[1]='m';
		gender[2]='F';
		gender[3]='m';
		long mobileNumber[] = new long[5];
		mobileNumber[0]=987654;
		mobileNumber[1]=234567;
		mobileNumber[2]=456789;
		mobileNumber[3]=234567;
		System.out.println("STUDENT   GENDER   ROLLNUMBER   MOBILENUMBER");
		System.out.println(studentName[0]+"        "+gender[0]+"          "+rollNo[0]+"             "+mobileNumber[0]);
		System.out.println(studentName[1]+"        "+gender[1]+"          "+rollNo[1]+"             "+mobileNumber[1]);
		System.out.println(studentName[2]+"       "+gender[2]+"          "+rollNo[2]+"             "+mobileNumber[2]);
		System.out.println(studentName[3]+"      "+gender[3]+"          "+rollNo[3]+"             "+mobileNumber[3]);
	}
}
