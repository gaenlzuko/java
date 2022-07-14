package test.Task;

import java.io.IOException;


public class Task17 {
    public static void main(String[] args) throws IOException {
        char a = (char)System.in.read();
        String bin = Integer.toBinaryString(a);
        System.out.println("The binary code: "+bin);
        System.out.println("Decimal: " + (int)a);
        System.out.printf("Unicode: %04X ", (int)a);
    }
}