import java.util.Scanner;
public class Test {
     private void printData(String name, int age) {
        System.out.println("Hello, "+ name);
        System.out.println("Your age is "+ age);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        String name = sc.nextLine();
        int age = sc.nextInt();
        t.printData(name, age);
        sc.close();
    }
}