package test.Task;


public class Task05 {
    public static void main(String[] args) {
        int seconds = 99999;
        System.out.println(getTime(seconds));
    }

    public static String getTime(int value){
        long hh = value/3600;
        long mm = value/60 % 60;
        long ss = value % 60;
        return String.format("%s ч %s мин %s сек", hh, mm, ss);
    }
}
