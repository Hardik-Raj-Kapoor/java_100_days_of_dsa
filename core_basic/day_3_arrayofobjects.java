class Student1{
int rollno;
String name;
int marks;	
}
public class day_3_arrayofobjects {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.rollno=1;
		s1.name="Hardik";
		s1.marks=88;
		
		Student1 s2=new Student1();
		s2.rollno=2;
		s2.name="Sukalp";
		s2.marks=67;
		
		Student1 s3=new Student1();
		s3.rollno=3;
		s3.name="Samriddh";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student1 students[]=new Student1[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].name+":"+students[i].marks);
		}
		for(Student1 stud: students){
			System.out.println(stud.rollno + " : " + stud.name+" : "+stud.marks);
		}
	}
}

