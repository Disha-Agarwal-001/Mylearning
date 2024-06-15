import java.util.*;
public class Size {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Arr[] = new int[size];
        //input
        for(int i=0; i<size; i++) {
            Arr[i] = sc.nextInt();
        }
        //output
        for(int i=0; i<size; i++) {
        System.out.println(Arr[i]);
        }
        sc.close();
    }
}