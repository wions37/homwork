import java.util.Scanner;

public class Ver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int sum = 0;

        while (true) {
            try {
                System.out.println("원하는 기능을 선택하세요, 1: 덧셈, 2:뺄셈, 3: 곱셈, 4:나눗셈, 0:종료");
                choice = Integer.parseInt(input.nextLine());
                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                if (1 > choice || choice > 4) {
                    System.out.println("올바른 입력이 아닙니다.");
                    continue;
                }

                System.out.println("첫번째 값을 입력하고 엔터를 누르세요: ");
                int num1 = Integer.parseInt(input.nextLine());
                System.out.println("두번째 값을 입력하고 엔터를 누르세요: ");
                int num2 = Integer.parseInt(input.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println(num1 + "+" + num2 + "=" + sum);
                        break;
                    case 2:
                        System.out.println(num1 + "-" + num2 + "=" + sum);
                        break;
                    case 3:
                        System.out.println(num1 + "*" + num2 + "=" + sum);
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println(num1 + "/" + num2 + "=" + (double) num1 / num2);
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                        }
                        break;

                }
            } catch (NumberFormatException e) {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }

    }

}



