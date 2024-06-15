
class A {
    int length;
    int width;

    A(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Here is a constructor");
    }
}

class B extends A {
    B(int l, int w) {
        super(l, w);
        System.out.println(this.length);
    }
    public static void main(String args[]) {
        new B(0,0);
    }
}
