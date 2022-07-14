package test.Task;


public class Task04 {
    public static void main(String[] args) {
        double x = 123.456;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}