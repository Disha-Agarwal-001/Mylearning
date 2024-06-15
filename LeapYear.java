public class LeapYear {
    public static void main(String args[]){
        int a=2023;
        if(a%4==0 || a%400==0) {
            System.out.println("Year is Leapyear");
        }
        else{
                System.out.println("Normal year");
            }
    }
}
