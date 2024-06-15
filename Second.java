 class Triangle {
    double sideA;
    double base;
    double sideC;
    double height;
    void Area(double b,double h) {
        base=b;
        height=h;
        double area = (b*h)/2;
        System.out.println(area);
    }
    void Parameter(double a,double b,double c){
        sideA=a;
        base=b;
        sideC=c;
        double parameter = (a+b+c);
        System.out.println(parameter);
    }
}
    class Second {
    public static void main(String args[]) {
        Triangle s1=new Triangle();
        s1.Area(4,10);
        s1.Parameter(2,4,8);
    } 

}

