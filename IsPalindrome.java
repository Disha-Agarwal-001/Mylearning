class IsPalindrome {
    public static void main(String args[]) {
        int[] arr=new int[]{1,2,2,3,2,1};
        for(int i=0,j=arr.length-1; i<=j ;i++,j--) {
            if(arr[i]==arr[j]) {
                if(i>=j) {
                    System.out.println("yes");
                }
            }
            else{
                System.out.println("no");
                break;
            }
        }
    }
}
