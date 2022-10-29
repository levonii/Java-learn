package arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        //自写foreach遍历
//        int i = 0;
//        for (int a:arr
//             ) {
//            if(a==33){
//                System.out.println(i);
//            }else{
//                i++;
//            }
//        }
        // 二叉树索引（改进）
        System.out.println(Arrays.binarySearch(arr,33));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
