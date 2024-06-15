import java.util.Scanner;
public class FunAdd {
    public static int addSum(int a,int b) {
        int c = a + b;
        System.out.print(c);
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value for a\n");
        int a = sc.nextInt();
        System.out.print("enter a value for b\n");
        int b = sc.nextInt();
        //calling function
        System.out.print("your sum is\n");
        addSum(a,b);
        sc.close();
    } 
}