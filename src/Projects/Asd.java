package Projects;

public class Asd {
    static int[] list = {1, 2,3,5,6,7};

    static void foo(int[] list){
        list[2] = 100;
    }
    static void fooA(A a){
        a.setX(100);

    }

    public static void main(String[] args) {
        System.out.println(list[2]);
        foo(list);
        System.out.println(list[2]);
        A a = new A(5);
        System.out.println(a.getX());
        fooA(a);
        System.out.println(a.getX());
    }
}
class A {
    private int x;

    public A (int y) {
        x = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}