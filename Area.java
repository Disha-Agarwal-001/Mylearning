public class Area {
    float breadth;
    float height;
    void display(float b,float h) {
        breadth=b;
        height=h;
        float A=(1/2)*b*h;
        System.out.println(A);
    }
    public static void main(String args[]) {
        Area s1=new Area();
        s1.display(10,20);
    }
}
