import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//class Student implements Comparable<Student>
class Student{
	int age;
	String name;
	
	public Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	public String toString(){
		return "Student [age=" + age + ", name=" +name +"]";
	}
//	public int CompareTo(Student that){
////		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}
	
public class day_17_Comparator_Comparable {
    public static void main(String[] args) {
        //    	Comparator<Integer> com=new Comparator<Integer>(){
//    		public int compare(Integer i,Integer j){
//    			if(i%10 >j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	

//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);
    	
//    	Comparator<Student> com=new Comparator<Student>(){
//    		public int compare(Student i,Student j){
//    			if(i.age >j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	
    	
    	Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;
     	
    	List<Student> studs= new ArrayList<>();
    	studs.add(new Student(21,"Hardik"));
    	studs.add(new Student(12,"Sukalp"));
    	studs.add(new Student(18,"Samriddh"));
    	studs.add(new Student(20,"ABCDEF"));
    	
//    	Collections.sort(nums);
//    	System.out.println(nums);
    	
    	for(Student s:studs)
    		System.out.println(s);
    	
    	Collections.sort(studs,com);
    	for(Student s: studs)
    		System.out.println(s);
    }
}
