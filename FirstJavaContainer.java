import java.util.Scanner;

public class FirstJavaContainer {
    public static void main(String... args) {
        System.out.println("Enter your input:");
        Scanner in = new Scanner(System.in);
        System.out.println("Starting");
        for (int i=0; i<3; i++) {
            String s = in.nextLine();
            System.out.println("Hello " + s);
        }
    }
}
