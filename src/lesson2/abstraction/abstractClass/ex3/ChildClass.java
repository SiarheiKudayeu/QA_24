package lesson2.abstraction.abstractClass.ex3;

public class ChildClass extends ParentClass implements Inter2,Inter1{
    @Override
    public void print() {
        System.out.println("реализация");
    }
}
