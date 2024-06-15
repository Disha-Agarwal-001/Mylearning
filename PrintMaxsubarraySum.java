public class PrintMaxsubarraySum {
    public static void maxSubArrSum(int num[]) {
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                currSum=0;
                for(int k=i; k<=j; k++) {
                    currSum += num[k];                   
                    }
                    System.out.println(currSum);
                    if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximuum sum is " + maxSum);
    }
    public static void main(String args[]) {
        int num[] ={2,4,6,8};
         
        maxSubArrSum(num);
    }   
}