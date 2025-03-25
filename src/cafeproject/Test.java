package cafeproject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
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
