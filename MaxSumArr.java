public class MaxSumArr {
    public static void maxSubArraySum(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i;j<arr.length;j++) {
                currentSum = 0;
                for(int k=i; k<=j; k++) {
                    currentSum = currentSum + arr[k]; 
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.print("maximum Sub array Sum is="+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        maxSubArraySum(arr);
    } 
}