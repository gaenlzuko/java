package test.Task;


public class Task14 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for(int i = 1; i<n; i++){
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}