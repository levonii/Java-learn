package objectOriented.inner;

public class People {
    private String name = "LiLei";
    static String ID = "510xxx199X0724XXXX";
    public static class Student{
        String ID = "20151234";

        public void stuInFo(){
            System.out.println("访问外部类中的name："+new People().name);
            System.out.println("访问外部类中的ID：" + People.ID);
            System.out.println("访问内部类中的ID："+ID);
        }
    }

    public static void main(String[] args) {
        People a= new People();
        Student b = new Student();
        b.stuInFo();
    }
}
