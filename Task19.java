package test.Task;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("Same numbers are: ");

        for(int i = 0; i< a.length(); i++){
            for(int j = 0; j< b.length(); j++){
                if(a.charAt(i)==b.charAt(j)){
                    System.out.print(b.charAt(j)+ " ");
                }
            }
        }
    }
}