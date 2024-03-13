import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner s = new
                Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if ((a.equals(b)) == true) {
            System.out.println("Строки идентичны");
        } else {System.out.println("Строки неидентичны");
        }
    }
}
