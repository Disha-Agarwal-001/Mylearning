import java.util.*;
public class Search2Darr {
    public static int largestElem(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j =0; j<matrix[0].length; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }    
        return max;  
    }
    public static int smallestElem(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j =0; j<matrix[0].length; j++) {
                if(smallest >  matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static boolean searchInmatrix(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j =0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                  System.out.println("found key at (" +i+","+j+")");
                  return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]) {
        int matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        int n=matrix.length,m=matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchInmatrix(matrix, 5);
        System.out.println("largest element is " + largestElem(matrix));
        System.out.print("smallest element is " + smallestElem(matrix));
        sc.close();        
    }  
}