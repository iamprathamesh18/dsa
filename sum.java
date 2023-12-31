import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum1();
    }
    static void sum1() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 st");
        int num1 = in.nextInt();

        System.out.println("enter 2nd");


        int num2 = in.nextInt();

        int num = num1 + num2;
        System.out.println(num);



    }
}