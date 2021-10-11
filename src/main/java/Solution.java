package by.epam.tr.start;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int x = readInt();
        int y = readInt();
        printResult(insideSector(x, y));
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        return m;
    }

    public static boolean insideSector(int x, int y) {
        return (x >= -2) && (x <= 2) && (y >= 0) && (y <= 4) || (x >= -4) && (x <= 4) && (y >= -3) && (y <= 0);
    }

    public static void printResult(boolean insideSector) {// один в один разбирали ошибку на занятии, а снова здравствуйте. Зачем тебе if в этом методе?
        if (insideSector == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

// про чистоту репозитория мы говорили
