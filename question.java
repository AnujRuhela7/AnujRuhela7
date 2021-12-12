package com.myname.main;
import com.myname.student.*;
import java.util.Scanner;

public class StudentMain extends Student
{
	public void search(String[] student, int rollNo)
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] student = new String[3];
		for(int i = 0; i < student.length; i++)
		{
			student[i] = sc.nextLine();
		}
		
	}
}


// Another File

package com.myname.student;

public class Student 
{
	private String name;
	private int rollNo;
	private float CPI;
	private String getName() 
	{
		return name;
	}
	private void setName(String name) 
	{
		this.name = name;
	}
	private int getRollNo() 
	{
		return rollNo;
	}
	private void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	private float getCPI() 
	{
		return CPI;
	}
	private void setCPI(float cPI) 
	{
		CPI = cPI;
	}
	public String toString()
	{
		return name + " " + rollNo + " " + CPI;
	}
	
	
}




