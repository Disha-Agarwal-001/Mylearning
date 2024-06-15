import java.util.*;
public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] Arr=new int[rows][columns];
        //input
        //rows
        for(int i=0; i<rows;i++) {
            //columns
            for(int j=0; j<columns;j++) {
                Arr[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<rows;i++) {
            for(int j=0; j<columns;j++) {
            System.out.print(Arr[i][j] + " ");
            }
            System.out.println(); 
        }
        sc.close();
    }
}