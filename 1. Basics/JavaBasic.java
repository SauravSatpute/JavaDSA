import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int sum = num1 + num2;
        // int product = num1 * num2;
        // System.out.println(product);

        //Area of Circle
        //f because - by default float
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
