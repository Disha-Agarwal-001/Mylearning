public class PatternTangle {
    public static void main (String args[]) {
       /*  for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("x");
            }
             System.out.println();
        }*/
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
