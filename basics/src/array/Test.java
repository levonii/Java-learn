package array;

public class Test {
    public static void main(String[] args) {
        int[] a= {1,2,3};
        int[] b=a;
        for (int i = 0; i < a.length; i++) {
            b[i]++;
        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
