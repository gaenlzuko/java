package test.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        final int SumOfAngel = 180;

        int c = SumOfAngel - (a + b);
        if(a >= SumOfAngel || b >= SumOfAngel){
            System.out.println("Triangle doesn't exist");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("Triangle exists.Right triangle");
        } else {
            System.out.println("Triangle exists");
        }
    }
}