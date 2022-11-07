package Projects.Classes.ClassesConstructors.ClassesConstructorParameters;

public class ClassesConstructorParameter {
    int x;

    public ClassesConstructorParameter(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ClassesConstructorParameter myObj = new ClassesConstructorParameter(5);
        System.out.println(myObj.x);
    }
}
