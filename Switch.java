import java.util.*;
public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch(Button) {
            case 1: System.out.println("for English");
            break;
            case 2: System.out.println("for Hindi");
            break;
            case 3: System.out.println("For Urdu");
            break;
            default: System.out.println("Invalid Button");
        }
        sc.close(); 
    }
}
