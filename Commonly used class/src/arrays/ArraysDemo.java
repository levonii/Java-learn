package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr,9);
        System.out.println("fill:"+Arrays.toString(arr));
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println("重新赋值："+Arrays.toString(arr));
        arr[5] = 50;
        Arrays.sort(arr);
        System.out.println("sort排序后："+Arrays.toString(arr));
        //查找五十位置
        System.out.println("50位置的元素索引："+Arrays.binarySearch(arr,50));
        //复制数组
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("equals:"+Arrays.equals(arr, newArr));
    }
}
