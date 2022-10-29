package RANDOM;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int a = sc.nextInt();
        int b= sc.nextInt();
            System.out.println(random.nextInt(b-a+1)+a);
    }
}
