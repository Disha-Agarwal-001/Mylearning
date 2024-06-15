public class PaternDiamond {
    public static void main(String args[]) {
        int n=5;
      /*  //upper half
        for(int i=1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //1st half;
            for(int j=1;j<=i;j++) {
                System.out.print("x");
            }
            //2nd half
             for(int j=i;j>=1;j--) {
                System.out.print("x");
            }
            System.out.println();   
        }
        //lower half
         for(int i=n; i>=1; i--) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //1st half
            for(int j=1;j<=i;j++) {
                System.out.print("x");
            }
            //2nd half
            for(int j=i;j>=1;j--) {
                System.out.print("x");
            }
            System.out.println();   
        }*/
        //First Half
        for(int i=1; i<=n; i++) {
           //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        //Second Half
        for(int i=n; i>=1; i--) {
           //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    } 
}