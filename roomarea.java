class room {
float length;
float breadth;
void getdata(float a,float b){
length=a;
breadth=b;
}
}
class Roomarea{
public static void main(String args[])
{
float area;
room room1=new room();
room1.getdata(14,10);
area = room1.length*room1.breadth;
System.out.println("Area="+area);
}
}

