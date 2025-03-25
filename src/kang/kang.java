package kang;

import java.util.Arrays;
import java.util.Scanner;

public class kang {
    public static void main(String[] args) {
        int[] CorAr = new int[5];
        boolean S = true;
        while (S) {
            for (int i = 0; i < 5; i++) {
                CorAr[i] = (int) (Math.random() * 9);
            }
            int n;
            if (CorAr[0] != 0) {
                n = 0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == j) {
                            continue;
                        } else if (CorAr[i] == CorAr[j]) {
                            n = 0;
                        } else {
                            n++;
                        }
                    }
                    if (n == 20)
                        S = false;
                }
                // 테스트 문구입니다.
                System.out.println("테스트 시작");
                String test = new String();
                Scanner scan = new Scanner(System.in);
                int players = scan.nextInt();
                System.out.print("  ");
                for (int i = 0; i < players; i++) {
                    System.out.printf("%s   ", i + 1);
                }

            }
        }
        int[] answer = new int[5];
        Scanner scan = new Scanner(System.in);
        int times = 0;
        while (true) {
            times++;
            int BC = 0, SC = 0;
            int ans;
            ans = scan.nextInt();
            for (int i = 0; i < 5; i++) {
                double f = 4 - i;
                answer[i] = (int) (ans / (Math.pow((double) 10, f)));
                ans = ans - (int) (Math.pow(10, f) * answer[i]);
            }
            // System.out.println(Arrays.toString(answer));
            for (int i = 0; i < 5; i++) {
                if (answer[i] == CorAr[i]) {
                    SC++;
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == j) {
                        continue;
                    } else if (CorAr[i] == answer[j]) {
                        BC++;
                    }
                }
            }
            System.out.printf("%d 스트라이크, %d 볼입니다\n", SC, BC);
            if (SC == 5)
                break;
        }
        int an = 0;
        for (int i = 0; i < CorAr.length; i++) {
            int k = CorAr.length - i - 1;
            an = an + CorAr[i] * (int) (Math.pow(10, k));
        }
        System.out.println("답은 " + an + "이였습니다");
        System.out.printf("축하합니다 %d회 만에 맞췄습니다", times);

        // 테스트 문구입니다.
        System.out.println("테스트 시작");
        String test = new String();
        Scanner scank = new Scanner(System.in);
        int players = scank.nextInt();
        System.out.print("  ");
        for (int i = 0; i < players; i++) {
            System.out.printf("%s   ", i + 1);
        }
    }
}