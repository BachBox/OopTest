package Oop.MyUtil;

import java.util.Scanner;

public class Util {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String request, String error) {
        int n;
        while (true) {
            try {
                System.out.println(request);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }

    public static String getString(String request) {
        System.out.println(request);
        return sc.nextLine();
    }
 
}
