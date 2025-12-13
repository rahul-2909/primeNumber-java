import java.util.Scanner;

public class MultiplicationTable {

    public static void table(int n,int c){
       for( c=1; c<=10; c++){
        System.out.println(n+"*"+c+" = "+(n*c));
       } 
    }
    public static void main(String[] args) {
        int n,c=1;
        System.out.println("enter an integer to printe it's multiplicationtable");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        table(n, c);
    }
}
