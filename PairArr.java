public class PairArr {
    public static void printPairArray(int arr[]) {
        int tp = 0;
        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total Pair = " + tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        printPairArray(arr);
    }
}