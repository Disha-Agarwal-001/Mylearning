public class Student1 {
	String name;
	int roll;
	int age;
	String dept;
	
	Student1(String name, int roll, int age, String dept){
		this.name=name;
		this.roll=roll;
		this.age=age;
		this.dept=dept;
	}
	void details() {
		System.out.println("Student name= "+name+" roll no= "+roll+" age= "+age+" department= "+dept);
	}

	public static void main(String[] args) {
		Student1 s1=new Student1("Disha",37,22,"CEA");
		s1.details();
	}

}

