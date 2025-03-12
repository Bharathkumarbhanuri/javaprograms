package javaprograms;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	int rollno;
	String name;
	int age;
	String branch;

	public Student(int rollno, String name, int age, String branch) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.age = age;
			this.branch = branch;
		}
	
	public String toString() {
        return "{Roll No: " + rollno + ", Name: " + name + ", Age: " + age + ", Branch: " + branch + "}";
    }
}

public class StreamsDemo {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(1,"bharath",20,"ecm"),new Student(2,"ravi",21,"bsc"),
				new Student(3,"naveen",21,"cse"),new Student(4,"sai",21,"bsc"),new Student(5,"bro",20,"ecm"));
		
		Map<Integer, List<Student>> byAge = students.stream()
				.collect(Collectors.groupingBy(student-> student.age));
		System.out.println(byAge);
		
	}
}
