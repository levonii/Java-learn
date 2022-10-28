package exercise;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] a = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        int max=a[0],min=a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("最大值："+max+"最小值："+min);
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
