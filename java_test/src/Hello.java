import java.util.Scanner;

public class Hello {

    public static void main(String[] args ) {
        int x = 5;
        System.out.println(" Hello Java World !!! ");
        System.out.println(x);

        char y = 'a';
        String z = "a";
        System.out.println(y );
        System.out.println(z);
        System.out.println(y+z);

        Scanner scanner = new Scanner(System.in);
        System.out.println("두 자리 숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("입력 내용 : " + num);
        System.out.printf(" num = %d%n", num);

        for (int i =0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
