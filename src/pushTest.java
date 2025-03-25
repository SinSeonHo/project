import java.util.Scanner;

public class pushTest {
    public static void main(String[] args) {
        System.out.println("ssh push test");

        // 수정해서 해보겠습니다.
        System.out.println("강동현 테스트 추가");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(a);
        System.out.println("test2");
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
