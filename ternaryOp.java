import java.util.*;
public class ternaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String type = ((num % 2 == 0)? "even" : "odd");
        System.out.print(type);
        sc.close();
    }
}
