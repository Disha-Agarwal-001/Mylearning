public class PrintSubArr {
    public static void printSubArray(int arr[]) {
        int ts =0;
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=start; j<arr.length; j++) {
                int end = j;
                for(int k = start; k<=end; k++) {
                    System.out.print(arr[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Sub Array = " + ts);
    }
    public static void main(String args[]) {
        int arr[] ={2,4,6,8};
        printSubArray(arr);
    } 
}