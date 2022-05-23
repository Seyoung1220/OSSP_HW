import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        String name;

        System.out.print("이름을 입력하세요: ");
        name = sc.next();

        System.out.print("학번을 입력하세요: ");
        num = sc.nextInt();

        System.out.println("\n<출력> \n이름: " + name + "\n학번: " + num);

    }
}
