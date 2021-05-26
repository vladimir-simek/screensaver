package com.vladimirsimek.com;

public class Main {

    public static final String a = "/";
    public static final String b = "|";
    public static final String c = "\\";


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int psvmidk = 1;
            if (psvmidk == 1) {
                System.out.println(a);
                psvmidk++;
            }
            if (psvmidk == 2) {
                System.out.println(b);
                psvmidk++;

            }
            if (psvmidk == 3) {
                System.out.println(c);
                    psvmidk = 1;
            }
        }

    }
}