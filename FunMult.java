import java.util.Scanner;
public class FunMult {
    public static int calculateProduct(int a, int b) {
        return a*b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value for a:-");
        int a = sc.nextInt();
        System.out.print("enter a value for b:-");
        int b = sc.nextInt();
        //calling function
        System.out.print("your product is:"+ " " +calculateProduct(a,b));
        sc.close();
    } 
}