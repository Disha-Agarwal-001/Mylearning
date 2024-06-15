import java.util.*;

public class Idiary {
    
    public static String gradeCount(int maths, int eng, int sci) {
    
        String Grade = null ;
        int sum = (maths + eng + sci);
        float percent = (sum/300.0f)*100 ;
        //System.out.println(percent);
        if(percent > 90 && percent <=100) {
            Grade = "A";
        }
        else if(percent>80 && percent <=90) {
            Grade = "B";
        }
        else if(percent >70 && percent <=80) {
            Grade = "C";
        }
        else if(percent >60 && percent <=70) {
            Grade = "D";
        }
        else if(percent >50 && percent <=60) {
            Grade = "E";
        }
        else if(percent >40 && percent <=50) {
            Grade = "F";
        }
        else if(percent >30 && percent <=40) {
            Grade = "G";
        }
        else if(percent >0 && percent <=30) {
            Grade = "H";
        }
        return Grade;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Student Name : ");
	    String Student = sc.nextLine();
	    System.out.println("Enter for maths :");
	    int maths = sc.nextInt();
	    System.out.println("Enter for eng :");
	    int eng = sc.nextInt();
		System.out.println("Enter for sci :");
		int sci = sc.nextInt();
		int Average = (maths+eng+sci)/3;
		System.out.println("Average : " + Average);
		
		/*Main obj = new Main();
		String grade = obj.gradeCount(maths,eng,sci);*/
		System.out.println("Grade: " + gradeCount(maths,eng,sci));
	}
    sc.close();
}