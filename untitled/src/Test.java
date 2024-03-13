import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s=new
                Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        if (a>b) {
            System.out.println("a > b");
        } else if (a<b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("a * b = " + (a * b));
    }
}