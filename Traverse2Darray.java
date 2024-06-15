import java.util.*;
public class Traverse2Darray {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
         System.out.println("Enter number of columns");
        int cols=sc.nextInt();
        int[][] Matrix = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols;j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols;j++) {
                if(Matrix[i][j]==x) {
                    System.out.print("x found at("+ i + "," +j +")");
                }
            }
        }
        sc.close();
    }   
}
