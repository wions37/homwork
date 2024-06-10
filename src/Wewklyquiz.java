import java.util.Scanner;

public class Wewklyquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 기능을 선택하세요, 1: 덧셈, 2:뺄셈, 3: 곱셈, 4:나눗셈, 0:종료");
            int option = input.nextInt();

            if (option == 1) {

                System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                int num1 = input.nextInt();

                System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                int num2 = input.nextInt();

                int sum = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + sum);

            } else if (option == 2) {

                System.out.print("첫번째 값을 입력하고 엔터를 누르세요.");
                int num1 = input.nextInt();

                System.out.print("두번째 값을 입력하고 엔터를 누르세요.");
                int num2 = input.nextInt();

                int sum = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + sum);


            } else if (option == 3) {

                System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                int num1 = input.nextInt();

                System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                int num2 = input.nextInt();

                int sum = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + sum);

            } else if (option == 4) {

                System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
                int num1 = input.nextInt();

                System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
                int num2 = input.nextInt();

                int sum = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + sum);

            } else if (option == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
        input.close();
    }
}
