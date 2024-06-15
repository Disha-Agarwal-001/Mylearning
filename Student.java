public class Student {
    String college;
    Student(String c)
    {
    college = c;
    }
    void display()
    {
        System.out.println(college);
    }
    public static void main(String args[]){
    Student s1=new Student("GLA");
    Student s2=new Student("Gla");
    s1.display();
    s2.display();
}
}