package kang;

import java.util.Arrays;
import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        // ㅣ ㅣ ㅣ ㅣ
        // ㅣㅡㅣㅡㅣ
        Scanner scan = new Scanner(System.in);
        int players = scan.nextInt();
        System.out.print("  ");
        for (int i = 0; i < players; i++) {
            System.out.printf("%s   ", i + 1);
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < players; i++) {
            System.out.print("ㅣ  ");
        }
        System.out.println();
        String[][] ladder = new String[15][2 * players + 1];
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 == 1) {
                    ladder[i][j] = "ㅣ";
                } else {
                    int a = (int) (Math.random() * 10) + 1;
                    if (a % 3 == 2 && (i + j / 2) % 2 == 1 && j != 0 && j != (2 * players)) {
                        ladder[i][j] = "ㅡ";
                    } else {
                        ladder[i][j] = "  ";
                    }
                }
            }
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }
        System.out.printf("1~%d까지의 수 중 하나를 고르시오", players);
        int ch = scan.nextInt();
        System.out.print("  ");
        for (int i = 0; i < players; i++) {
            if (ch - 1 == i)
                System.out.print("*   ");
            else
                System.out.printf("%s   ", i + 1);
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < players; i++) {
            if (ch - 1 == i)
                System.out.print("*   ");
            else
                System.out.print("ㅣ  ");
        }
        System.out.println();
        ladder[0][2 * ch - 2] = "* ";
        // for (int i = 0; i < ladder.length; i++) {
        // for (int j = 0; j < ladder[i].length; j++) {
        // System.out.print(ladder[i][j]);
        // }
        // System.out.println();
        // }
        for (int i = 1; i < ladder.length; i++) {
            for (int j = 1; j < ladder[i].length; j++) {
                if ((ladder[i][j] == "ㅣ ") && (ladder[i - 1][j].equals("* "))) {
                    // || ladder[i][j - 1].equals("*"))
                    // || ladder[i][j + 1].equals("*")) {
                    ladder[i][j] = "* ";
                }

            }
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }
    }
}