public class ArrLargestNum {
    public static int largestNum(int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        System.out.println("largest value is" +" " + largestNum(num));
    }
    
}
