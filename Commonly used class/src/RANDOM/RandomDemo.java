package RANDOM;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        while(true){
            System.out.println((random.nextInt(100 - 40 + 1) + 40));
        }

    }
}
