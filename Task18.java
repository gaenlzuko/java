package test.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        if(n<=m){
            System.out.println("Error");
        } else {
            while(m<=n){
                System.out.print("\n"+m+": ");
                for(int i = 2; i<m; i++){
                    if(m%i == 0){
                        System.out.print(i+ " ");
                    }
                }
                m++;
            }
        }
    }
}