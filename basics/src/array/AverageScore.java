package array;

public class AverageScore {
    public static void main(String[] args) {
        int[] score = {61,57,95,85,75,65,44,66,90,32};
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        sum=sum/score.length;
        System.out.println(sum);
    }
}
