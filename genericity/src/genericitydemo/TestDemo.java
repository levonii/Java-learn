package genericitydemo;

class Test<T>{
    private T ob;
    public Test(T ob){
        this.ob = ob;

    }
    public T getOb(){
        return ob;
    }
    public void setOb(T ob){
        this.ob = ob;
    }
    public void showType(){
        System.out.println("T的实际类型是："+ob.getClass().getName());
    }
}

public class TestDemo {
public static void main(String[] args){
    Test<Integer> intOb = new Test<>(88);
    intOb.showType();
    int i = intOb.getOb();
    System.out.println("Value=" + i);
    System.out.println("------------------");
    //定义泛型的String版本
    Test<String> strOb = new Test<>("Hello Gen!");
    strOb.showType();
    String s = strOb.getOb();
    System.out.println(s);
}
}

