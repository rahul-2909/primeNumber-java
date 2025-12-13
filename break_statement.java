import java.util.Scanner;

public class break_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         do {
            System.out.print("enter your number :-" + " ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("entered number is " + n);
            System.out.println();
         } while (true);

    }
    
}
