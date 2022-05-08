package Assignment_01;

public class Q1  {

	public static void main(String[] args) {
		System.out.println("Question 01");
		System.out.println("MayankMishra_G_20011594");
		Student obj = new Student("Rahul", 14, 'A', 88);
		Student obj1 = new Student("Sumit", 14, 'A', 78);
		Student obj2 = new Student("YAsh", 12, 'A', 98);
		Student obj3 = new Student("Abhishek", 15, 'A', 38);
		Student obj4 = new Student("Aniket", 69, 'A', 58);
		Student obj5 = new Student("Pulkit", 18, 'A', 98);
		//Getting the result 
		Student result = new Student();
		result.get_avg();
		

	}

}

class Student
{
	String name;
	int age;
	char Section;
	int percentage; //assuming percentage to be discrete value
	static int avg_per = 0;
	
	Student()
	{
		age = 0;
		percentage = 0;
	}
	Student(String s, int a, char sec, int per) // Constructor name should be equal to class name
	{
		name = s;
		age = a;
		Section = sec;
		percentage = per;
		avg_per += per;
		
		System.out.println("\t");
		System.out.println("Name: "+name);
		System.out.println("Section= "+Section);
		System.out.println("Age= "+age);
		System.out.println("Percentage= "+percentage+"%");
	}
	
	void get_avg()
	{
		int average = avg_per/6;
		System.out.println("\t");
		System.out.println("Average Percantage of all students= "+average+"%"); 
	}
}