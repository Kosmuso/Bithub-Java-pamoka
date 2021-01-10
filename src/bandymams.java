import java.util.Scanner;

public class bandymams {

    public static void main(String[] arguments) {
        int n1 = 0, n2 = 1, n3;

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; ++i) {
            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
            System.out.println(""+n3);
        }
    }
}
