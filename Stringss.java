//import java.util.*;
public class Stringss {
    public static void main(String args[]) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        System.out.println(name);*/
        String Firstname= "Disha";
        String Lastname= "Agarwal";
        String Fullname= Firstname + " " + Lastname;
        System.out.println(Fullname.length());
        //chartAt
        for(int i=0; i<Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
        }
        //sc.close();
    }    
}