import java.util.*;
public class Condition {
    public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    int x = sc.nextInt();
    if(x<25) {
        System.out.println("Past age");
    }
    else if(x==25) {
        System.out.println("Present age");
    }
    else {
        System.out.println("F2uture age");
    }
    sc.close();
    }
}
