package objectOriented;

public class Test {
    public static void main(String[] args) {
//        Dog a = new Dog();
//        a.legNum = 4;
//        a.bark();
        Animal a=new Animal();
        Animal b=new Dog();
        Dog d = new Dog();
        a.bark();
        b.bark();
        d.bark();
        d.dogType();
    }
}
