package Projects.Classes.ClassesConstructors.ClassesContructorsExample;

import java.util.LinkedList;

public class ClassesConstructorExample {
    private int _modelYear;
    String modelName;

    public ClassesConstructorExample() {
        _modelYear = 1990;
        this.modelName = "Golf";
    }

    public ClassesConstructorExample(int year, String modelName) {
        this._modelYear = year;
        this.modelName = modelName;
    }

    public int get_modelYear() {
        return _modelYear;
    }

    public void set_modelYear(int modelYear) {
        _modelYear = modelYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        ClassesConstructorExample myCar = new ClassesConstructorExample(1969, "Mustang");
        new ClassesConstructorExample();
        System.out.println(myCar._modelYear + " " + myCar.modelName); // Outputs 1969 Mustang
        LinkedList<String> list = new LinkedList<>();
        list.size();
    }
}
