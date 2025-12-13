import java.util.Scanner;

public class continue_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=6;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
            do{
                System.out.println("enter your number");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println("number was : "+n);
            }while(true);
    }
}
