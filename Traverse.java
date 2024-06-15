import java.util.*;
public class Traverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int Array[] = new int[size];
        for(int i=0; i<Array.length; i++) {
            Array[i] = sc.nextInt(); 
        }
        System.out.println("Enter the value you want to find");
        int x = sc.nextInt();
        for(int i=0; i<Array.length; i++) {
            if(Array[i] == x) {
                System.out.println("x is found at"+" " + i);
            }
        }
        sc.close();
    }
}
