package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class OptionalEx {
    public static void main(String[] args) {
        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.println("result2 = " + x));

        OptionalInt optInt = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println(optInt.isPresent());
        System.out.println(optInt2.isPresent());

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
