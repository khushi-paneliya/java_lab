import java.util.*;
class scannertest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter rollno:");
		int rollno=sc.nextInt();
		System.out.println("Enter Name:");
		String nm=sc.next();
		System.out.println("Enter Fees:");
		double f=sc.nextDouble();
		System.out.println("Enter Stream:");
		String s=sc.next();
        System.out.println("rollno="+rollno+"\n Name="+nm+"\nFees="+f+"\nStream="+s);		
		 
		
	}
}