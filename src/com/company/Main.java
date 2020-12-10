package com.company;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int n) { // index number fibbonaci
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {

        // 1)  fibonacci Последовательност
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 1;
        int second = 1;
        int tmp = first + second;

        if(n == 1)
        {
            System.out.print(1 + " ");
        }

        if(n >= 2)
        {
            System.out.print(1 + " ");
            System.out.print(1 + " ");
        }

        for(int i = 0 ; i < n - 2;i++)
        {
            System.out.print(tmp + " ");
            first = second;
            second = tmp;
            tmp = first + second;
        }

        // 2) Index number
        System.out.println(fibonacci(8));
    }
}
