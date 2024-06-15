public class PrintArr {
    public void DemoArr(int[] MyArray) {
        int n= MyArray.length;
        for(int i=0; i<=n; i++) {
            System.out.print(MyArray[i]+" ");
        }
         System.out.println();
    }
    public static void main(String args[]) {
        PrintArr obj = new PrintArr();
        obj.DemoArr(new int[] {1,2,3,4,9});
 }    
}
