import java.util.Scanner;
public class Input {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = s.next();
        System.out.println("Enter your Age:");
        String age = s.next();
        System.out.println("Enter Your Gender:");
        char gender = s.next().charAt(0);
        System.out.println("Enter Your Phone No:");
        long phn = s.nextLong();
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Gender" + gender);
        System.out.println("Phone no" + phn);
        s.close();
    }
}