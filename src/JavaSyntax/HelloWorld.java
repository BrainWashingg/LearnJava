package JavaSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Long num = in.nextLong();

        Long hours = 0L, minutes = 0L, seconds = 0L;


        hours = num / 3600;
        num = num % 3600;

        minutes = num / 60;
        seconds = minutes % 60;

        String h = new String(String.valueOf(hours));
        System.out.println(hours + ":" + minutes + ":" + seconds);
        System.out.println(h);
        Date date = new Date(3600L);
        System.out.println(date);
    }

}

