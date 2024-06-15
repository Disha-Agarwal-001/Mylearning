class Abacus {
    int a=2;
}
class Betray extends Abacus {
    int a=20;
    void display() {
      System.out.println(a);
      System.out.println(super.a);
}
public static void main(String args[]) {
     Betray b1=new Betray();
     b1.display();
}
}

