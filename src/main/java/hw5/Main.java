package hw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AppData appdata = new AppData();
        appdata.load("hw5.txt");
        System.out.println(Arrays.toString(appdata.getHeader()));
        System.out.println(Arrays.deepToString(appdata.getData()));
        appdata.save("hw5-1.txt");
    }
}
