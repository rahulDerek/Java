package java2020;

public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(120,"kathik","srm");
		
		Student s2 = new Student(130,"malar","mem");
		
		College  c1 = new College("mem","226, Chet street");
		
		System.out.println("The student s1 roll number is "+s1.getRollNumber()+"name  is"+s1.getName()+"and his college name is"+c1.getCollege_name());
		
	}

}

class Student
{
	private int rollNo;
	private String name;
	private String collegeName;
	
	Student(int rollNo,String name, String collegeName)
	{
		this.rollNo = rollNo;
		this.name =name;
		this.collegeName=collegeName;
	}
	
	public int getRollNumber()
	{
		return this.rollNo;
	}
	
	public String getName()
	{
		
		return this.name;
	}
	
	public String getCollegeName()
	{
		
		return this.collegeName;
	}
}

class College{
	
	private String college_name;
	private String address;
	
	public College(String college_name, String address) {
		this.college_name = college_name;
		this.address = address;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
