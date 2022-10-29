package system;

public class SystemTest {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10, 11};
        int[] b = {1, 2, 3, 4, 5, 6};
        System.arraycopy(a,0,b,0,5);
        System.out.println(System.getProperty("java.home"));
    }
}
