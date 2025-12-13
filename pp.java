import java.util.Scanner;

public class pp {
    public static void main(string args[]){
        int num1,num2,temp;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("after swaoing"+num1+num2);
    }
}

