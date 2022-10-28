package scanner;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        String[] s = new String[100];
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(!sc.hasNext("end")){
           s[i]=sc.nextLine();
           i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(s[j]);
        }
        sc.close();
    }
}
